package com.yuefan.msc.accepter;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class AcceptFromDTU {
	
	public static void main(String[] args) {
		
		startServer();
	}

	/**
	 * 
	 */
	private static void startServer() {
		EventLoopGroup bossGroup = new NioEventLoopGroup();
		EventLoopGroup workerGroup = new NioEventLoopGroup();
		ServerBootstrap server = new ServerBootstrap();
		server.group(bossGroup,workerGroup);
		server.channel(NioServerSocketChannel.class);
		server.childOption(ChannelOption.SO_KEEPALIVE, true);
		server.childOption(ChannelOption.TCP_NODELAY, true);

		server.childHandler(new ChannelInitializer<Channel>() {

			@Override
			protected void initChannel(Channel ch) throws Exception {
				ChannelPipeline pipeline = ch.pipeline();
				pipeline.addLast(new DTUDecoder());
				pipeline.addLast(new DTUEncoder());
				pipeline.addLast(new DTUMessageHandler());
			}
			
		});
		try {
			System.out.println("Server start on port:9900...");
			ChannelFuture f = server.bind("127.0.0.1",9900).sync();
			System.out.println("binded: 9900...");
			f.channel().closeFuture().sync();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			bossGroup.shutdownGracefully();
			workerGroup.shutdownGracefully();
		}
	}
	

}
