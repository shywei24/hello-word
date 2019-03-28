package com.yuefan.msc.accepter;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.SimpleChannelInboundHandler;

public class DTUMessageHandler extends ChannelInboundHandlerAdapter {
	
	@Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		byte[] b = (byte[])msg;
		System.out.println(Thread.currentThread().getName()+"read msg :" + bytesToHexString(b));
		if(b.length == hexToByte("41 31 36 32 30 54 38 37 35 31 36 30 59 30 34 39").length){
			ctx.writeAndFlush(b);
		}else
		if(b.length == 1 && Test.count <= 3){
			String s = Test.getMsg();
			System.out.println(Thread.currentThread().getName()+"write :" + s);
			ctx.writeAndFlush(hexToByte(s));
		}
//        ctx.fireChannelRead(msg);
    }
	
//	@Override
//	protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
//
//		System.out.println("read0 "+msg);
//		ctx.writeAndFlush(hexToByte("01 03 00 00 00 02 C4 0B"));
//	}

	
//    @Override
//    public void channelActive(ChannelHandlerContext ctx) throws Exception {
//        System.out.println("RemoteAddress : " + ctx.channel().remoteAddress() + " active !");
//        //ctx.writeAndFlush("连接成功！");
//        super.channelActive(ctx);
//    }

	
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
//		System.out.println(hex);
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
