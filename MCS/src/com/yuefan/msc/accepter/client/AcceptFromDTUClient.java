package com.yuefan.msc.accepter.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.yuefan.msc.accepter.DTUDecoder;
import com.yuefan.msc.accepter.DTUEncoder;
import com.yuefan.msc.accepter.DTUMessageHandler;

import io.netty.bootstrap.Bootstrap;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.bytes.ByteArrayDecoder;
import io.netty.handler.codec.bytes.ByteArrayEncoder;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

public class AcceptFromDTUClient{
	
	public static void main(String[] args) throws IOException {
		
		EventLoopGroup eventGroup = new NioEventLoopGroup();
		Bootstrap client = new Bootstrap();
		client.group(eventGroup);
		client.channel(NioSocketChannel.class);
		

		client.handler(new ChannelInitializer<Channel>() {

			@Override
			protected void initChannel(Channel ch) throws Exception {
				ChannelPipeline pipeline = ch.pipeline();
				pipeline.addLast(new DTUDecoder());
				pipeline.addLast(new DTUEncoder());
				pipeline.addLast(new DTUClientHandler());
			}
			
		});
		System.out.println("Connecting to Server...");
		ChannelFuture cf = null;;
		try {
			cf = client.connect("127.0.0.1",9900).sync();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for (;;) {
			System.out.println("Key in：");
		    String line = in.readLine();
		    if (line == null) {
		        continue;
		    }
		    cf.channel().writeAndFlush(hexToByte(line));
	}
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
