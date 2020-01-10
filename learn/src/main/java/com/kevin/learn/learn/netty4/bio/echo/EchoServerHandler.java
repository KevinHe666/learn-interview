package com.kevin.learn.learn.netty4.bio.echo;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelPipeline;
import io.netty.util.CharsetUtil;

//public class EchoServerHandler extends ChannelInboundHandlerAdapter {
public class EchoServerHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        //第一种
        //Channel channel = ctx.channel();
        //channel.writeAndFlush(Unpooled.copiedBuffer("小滴课堂 xdclass.net",CharsetUtil.UTF_8));

        //第二种
        //ChannelPipeline channelPipeline = ctx.pipeline();
        //channelPipeline.writeAndFlush(Unpooled.copiedBuffer("小滴课堂 xdclass.net",CharsetUtil.UTF_8));

        //第三种
        ctx.writeAndFlush(Unpooled.copiedBuffer("小滴课堂 xdclass.net",CharsetUtil.UTF_8));



        ByteBuf data = (ByteBuf) msg;

        System.out.println("服务端收到数据: "+ data.toString(CharsetUtil.UTF_8));

        //ctx.fireChannelRead(data);   //调用下个handler

        ctx.writeAndFlush(data);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {

        System.out.println("EchoServerHandle channelReadComplete");

    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }


    @Override
    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
        System.out.println("EchoServerHandle channelRegistered");
    }

    @Override
    public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
        System.out.println("EchoServerHandle channelUnregistered");
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("EchoServerHandle channelActive");
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("EchoServerHandle channelInactive");
    }
}
