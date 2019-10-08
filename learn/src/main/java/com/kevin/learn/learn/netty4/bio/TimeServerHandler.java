package com.kevin.learn.learn.netty4.bio;

import java.net.Socket;

/**
 * @Description:
 * @Author: Kevin
 * @Create 2019-10-08 14:57
 */
public class TimeServerHandler implements Runnable {
    private Socket socket;

    public TimeServerHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        //写逻辑 解耦

    }
}
