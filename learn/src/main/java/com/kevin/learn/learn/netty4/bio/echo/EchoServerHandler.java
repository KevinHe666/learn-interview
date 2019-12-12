package com.kevin.learn.learn.netty4.bio.echo;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;

/**
 * @Description:
 * @Author: Kevin
 * @Create 2019-12-11 16:45
 */
public class EchoServerHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        //msg是客户端传过来的消息
        ByteBuf data = (ByteBuf) msg;
        System.out.println("服务端收到数据: " + data.toString(CharsetUtil.UTF_8));
        //h回显回去
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
        //这里一般记录异常日志
        System.out.println();
    }
}
