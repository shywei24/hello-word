package com.yuefan.msc.accepter;

import java.util.List;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.bytes.ByteArrayEncoder;

public class DTUEncoder extends ByteArrayEncoder{
	@Override
	protected void encode(ChannelHandlerContext ctx, byte[] msg, List<Object> out) throws Exception {
		
		super.encode(ctx, msg, out);
		
	}
	
    public static byte[] hexToByte(String hex){
    	hex = hex.replaceAll(" ", "");
		System.out.println(hex);
        int m = 0, n = 0;
        int byteLen = hex.length() / 2;
        byte[] ret = new byte[byteLen];
        for (int i = 0; i < byteLen; i++) {
            m = i * 2 + 1;
            n = m + 1;
            int intVal = Integer.decode("0x" + hex.substring(i * 2, m) + hex.substring(m, n));
            ret[i] = Byte.valueOf((byte)intVal);
        }
        return ret;
    }
    
	public static void main(String[] args) {
		
		hexToByte("01 03 00 00 00 02 C4 0B");
	}
}
