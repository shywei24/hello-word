package com.yuefan.msc.accepter;

import java.util.List;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.bytes.ByteArrayDecoder;

public class DTUDecoder extends ByteArrayDecoder{
	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf msg, List<Object> out) throws Exception {
		System.out.println("Reveive msg from DTU ...");
		byte[] rev = ByteBufUtil.getBytes(msg) ;
//		System.out.println(bytesToHexString(rev));
//		ctx.writeAndFlush(hexToByte("01 03 00 00 00 02 C4 0B"));
//		super.decode(ctx, msg, out);
		out.add(rev);
	}
	
	public static String bytesToHexString(byte[] src){  
	    StringBuilder stringBuilder = new StringBuilder("");  
	    if (src == null || src.length <= 0) {  
	        return null;  
	    }  
	    int n = 0 ;
	    for (int i = 0; i < src.length; i++) {
	        int v = src[i] & 0xFF;  
	        String hv = Integer.toHexString(v);  
	        if (hv.length() < 2) {  
	            stringBuilder.append(0);  
	        }  
	        stringBuilder.append(hv);
	        if (++n % 16 ==0 ) {
		        stringBuilder.append("\n");
			}else {
				stringBuilder.append(" ");
			}
	        
	    }  
	    return stringBuilder.toString();  
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
}
