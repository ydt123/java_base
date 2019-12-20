package com.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sender_UDP {

	public static void main(String[] args) throws Exception {
		//定义一个指定端口号为3000的发送端DatagramSocket对象
		DatagramSocket client=new DatagramSocket(3000);
		//定义要发送的数据
		String str="来自大东的问候：郭旭你好哟！";
		byte[] hcqsz=str.getBytes("UTF-8");
		//定义一个DatagramPacket数据报对象，封装发送端信息及发送地址
		DatagramPacket Packet=new DatagramPacket(str.getBytes(), str.getBytes().length,InetAddress.getByName("10.2.103.30"), 8900);
		System.out.println("开始发送信息...");
		client.send(Packet);//发送数据
		client.close();//释放资源

	}

}
