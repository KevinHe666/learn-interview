package com.kevin.learn.learn.netty4.bio.million;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * @Description:Nety百万链接的服务端
 * @Author: Kevin
 * @Create 2019-12-16 09:28
 */
public class NettyServerMillion {

    public static void main(String[] args) {
        new NettyServerMillion().run(Config.BEGIN_PORT, Config.END_PORT);

    }

    public void run(int beginPort, int endPort) {
        System.out.println("服务端启动中......");

        /**
         * 配置服务端的线程组
         */
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workGroup = new NioEventLoopGroup();

        //启动器
        ServerBootstrap serverBootstrap = new ServerBootstrap();
        serverBootstrap.group(bossGroup, workGroup)
                .channel(NioServerSocketChannel.class)
                //快速复用端口
                .childOption(ChannelOption.SO_REUSEADDR, true);

        serverBootstrap.childHandler(new TcpCountHandler());

        for (; beginPort < endPort; beginPort++) {
            int port = beginPort;
            serverBootstrap.bind(port).addListener((ChannelFutureListener) future -> {
                //绑定成功后回调输出
                System.out.println("服务端成功绑定端口 port = " + port);
            });
        }
    }
}
