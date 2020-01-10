package com.kevin.test;

import org.apache.zookeeper.*;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * @Description:zookeeper分布式锁实现 原生api不支持递归创建节点
 * @Author: Kevin
 * @Create 2020-01-05 19:43
 */
public class ZkLock {
    //====
    //构造方法
    private ZooKeeper zooKeeper;

    private static CountDownLatch countDownLatch = new CountDownLatch(1);

    private ZkLock() {
        try {
            zooKeeper = new ZooKeeper("192.1.1.:2181,192.1.1.:2181,192.1.1.:2181",
                    5000, new ZkWatcher());
            System.out.println(zooKeeper.getState());
            //等到连接上触发watcher
            countDownLatch.await();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private class ZkWatcher implements Watcher {

        @Override
        public void process(WatchedEvent event) {
            System.out.println("接收到监听事件=====>" + event);
            if (Event.KeeperState.SyncConnected == event.getState()) {
                //链接上了 -1
                countDownLatch.countDown();
            }
        }
    }

    private void lock(Integer id) {
        String path = "/jugg/product/" + id;
        //必须是临时节点
        try {
            zooKeeper.create(path, "".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);

        } catch (Exception e) {
            while (true) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                try {
                    zooKeeper.create(path, "".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
                } catch (Exception ex) {
                    continue;
                }
                break;
            }
        }
    }

    /**
     * 释放锁 直接释放zk节点
     *
     * @param id
     */
    private void unLock(Integer id) {
        String path = "" + id;
        try {
            zooKeeper.delete(path, -1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (KeeperException e) {
            e.printStackTrace();
        }

    }
//==========================================

    /**
     * 单例模式
     *
     * @return
     */
    public static ZkLock getInstance() {
        return Singleton.getInstance();
    }

    private static class Singleton {
        private static ZkLock instance;

        static {
            instance = new ZkLock();
        }

        private static ZkLock getInstance() {
            return instance;
        }
    }

}
