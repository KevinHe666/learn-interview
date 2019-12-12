package com.kevin.learn.learn.netty4.bio.echo;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.util.NettyRuntime;
import io.netty.util.internal.SystemPropertyUtil;

/**
 * @Description:Netty的测试Server类
 * @Author: Kevin
 * @Create 2019-12-11 16:46
 */
public class EchoServer {
    private final int port;

    public EchoServer(int port) {
        this.port = port;
    }

    /**
     * 启动流程
     */
    public void run() throws InterruptedException {
        //前台接待和代领去KTV的两个线程组
        //配置服务端线程组
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workGroup = new NioEventLoopGroup();
        try {
            //Netty需要启动一个引导类 负责整个服务启动的引导
            ServerBootstrap serverBootstrap = new ServerBootstrap();
//            主从线程 如果单线程 就将group注释一个 用一个设置为1即可
            serverBootstrap.group(bossGroup, workGroup)
                    //主通道
                    .channel(NioServerSocketChannel.class)
                    //主通道做处理 存放已完成三次握手的请求的等待队列的最大长度
                    .option(ChannelOption.SO_BACKLOG,1024)
                    .option(ChannelOption.TCP_NODELAY,true)
                    //子通道
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            //一建立的时候需要建立
                            //管道 整个串联起来
                            ch.pipeline().addLast(new EchoServerHandler());
                        }
                    });
            System.out.println("Echo 服务器启动ing......");
            //绑定端口 同步等待成功 需要同步等待他的异步绑定成功
            ChannelFuture channelFuture = serverBootstrap.bind(port).sync();
            //等待服务端端口关闭
            channelFuture.channel().closeFuture().sync();
        } finally {
            //优雅退出 释放线程池
            workGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }


    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("CPU核心数是: " + SystemPropertyUtil.getInt(
                "io.netty.eventLoopThreads", NettyRuntime.availableProcessors()));
        int port = 8080;
        if (args.length > 0) {
            port = Integer.parseInt(args[0]);
        }
        new EchoServer(port).run();
    }
}
