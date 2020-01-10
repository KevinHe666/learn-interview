package com.kevin.learn.learn.netty4.bio.echo;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;

public class InboundHandler2 extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg)
        throws Exception {
        ByteBuf data = (ByteBuf) msg;
        System.out.println("InboundHandler2 channelRead 服务端收到数据：" + data.toString(CharsetUtil.UTF_8));
        //ctx.pipeline().writeAndFlush(Unpooled.copiedBuffer("InboundHandler2 "+data.toString(CharsetUtil.UTF_8), CharsetUtil.UTF_8));
        //ctx.channel().writeAndFlush(Unpooled.copiedBuffer("InboundHandler2 "+data.toString(CharsetUtil.UTF_8), CharsetUtil.UTF_8));
        ctx.writeAndFlush(Unpooled.copiedBuffer("InboundHandler2 "+data.toString(CharsetUtil.UTF_8), CharsetUtil.UTF_8));

    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
        throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
