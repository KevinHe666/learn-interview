package com.kevin.learn.learn.netty4.bio.decoder;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

/**
 * ByteToMessageDecoder 需要检查缓冲区是否有足够的字节
 */
public class CustomDecoder extends ByteToMessageDecoder {
    /**
     * 入站的一个处理
     */
    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        // int 是4个字节,需要检查下是否满足
        if (in.readableBytes() >= 4) {
            //添加到解码信息里面去
            out.add(in.readInt());
        }


    }
}
