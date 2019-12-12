package com.kevin.learn.learn.netty4.bio.echo;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.net.InetSocketAddress;

/**
 * @Description:Netty测试客户端
 * @Author: Kevin
 * @Create 2019-12-11 18:11
 */
public class EchoClient {
    private final String host;
    private final int port;

    public EchoClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void start() throws InterruptedException {
        //写对应逻辑 就用一个线程了 KTV只管唱歌
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(group)
                    .channel(NioSocketChannel.class)
                    .remoteAddress(new InetSocketAddress(host, port))
                    .handler(new ChannelInitializer<SocketChannel>() {

                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            ch.pipeline().addLast(new EchoClinetHandler());
                        }
                    });
            //连接到服务端 connect是异步连接 再调用同步等待sync 等待连接成功
            ChannelFuture channelFuture = bootstrap.connect().sync();
            //阻塞直到客户端通道关闭
            channelFuture.channel().closeFuture().sync();
        } finally {
            //优雅退出 释放NIO线程组
            group.shutdownGracefully();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        new EchoClient("127.0.0.1", 8080).start();
    }
}
