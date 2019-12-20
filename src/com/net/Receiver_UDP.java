package com.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver_UDP {

	public static void main(String[] args) throws Exception {
		//创建套接字
		DatagramSocket server=new DatagramSocket(8900);
		//准备字节数组，1024个字节大小
		byte[] zjsz=new byte[1024];
		//创建数据报，用于接收数据
		DatagramPacket dp=new DatagramPacket(zjsz, zjsz.length);
		System.out.println("等待接收数据...");
		//创建死循环，不停接收数据
		while(true) {
			//通过套接字接收数据报
			server.receive(dp);
			//将数据报中的内容get出来，并转换为字符串
			String neirong=new String(dp.getData());
			System.out.println(dp.getAddress().getHostAddress()+":"+neirong);
		}
		
		

	}

}
