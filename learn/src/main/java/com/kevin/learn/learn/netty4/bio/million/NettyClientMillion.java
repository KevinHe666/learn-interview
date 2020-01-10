package com.kevin.learn.learn.netty4.bio.million;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * @Description:
 * @Author: Kevin
 * @Create 2019-12-16 09:28
 */
public class NettyClientMillion {
    private static final String SERVER = "127.0.0.1";

    public static void main(String[] args) {
        new NettyClientMillion().run(Config.BEGIN_PORT, Config.END_PORT);
    }

    public void run(int beginPort, int endPort) {
        System.out.println("客户端启动中...");
        EventLoopGroup group = new NioEventLoopGroup();
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(group)
                .channel(NioSocketChannel.class)
                //允许复用端口
                .option(ChannelOption.SO_REUSEADDR, true)
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel ch) throws Exception {

                    }
                });
        int index = 0;
        int finalPort;
        while (true) {

            finalPort = beginPort + index;

            try {
                bootstrap.connect(SERVER, finalPort).addListener((ChannelFutureListener) future -> {
                    if (!future.isSuccess()) {
                        System.out.println("创建连接失败 ");
                    }
                }).get();

            } catch (Exception e) {
                e.printStackTrace();
            }
            ++index;
            if (index == (endPort - beginPort)) {
                index = 0;
            }
        }
    }
}


