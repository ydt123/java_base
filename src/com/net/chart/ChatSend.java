package com.net.chart;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatSend implements Runnable {
	private DatagramSocket client;
	private int port;

	public ChatSend(DatagramSocket client, int port) {
		this.client = client;
		this.port = port;
	}

	@Override
	public void run() {
		while(true) {
		try {
			System.out.println("请输入要发送的信息：");
			// 创建Scanner对象，包装控制台输入
			Scanner sc = new Scanner(System.in);
			
			// 定义要发送的数据
			String str =sc.nextLine();
			byte[] hcqsz = str.getBytes("UTF-8");
			System.out.println("请输入要发送的IP地址：");
			String  ip=sc.nextLine();
			DatagramPacket Packet = new DatagramPacket(hcqsz, hcqsz.length, InetAddress.getByName("10.2.103."+ip), port);
			// 定义一个DatagramPacket数据报对象，封装发送端信息及发送地址
			client.send(Packet);
			
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} // 发送数据
		}
	}

}
