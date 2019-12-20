package com.net.chart;

import java.net.DatagramSocket;
import java.util.Scanner;

//聊天程序入口
public class ChartRoom {

	public static void main(String[] args) throws Exception {
//		//创建Scanner对象，包装控制台输入
//		Scanner sc=new Scanner(System.in);
//		//提示用户输入聊天服务开启的端口号
//		System.out.println("请输入聊天服务当前启动端口号：");
//		//用Scanner对象接受用户输入的整数，作为程序要开启的UDP端口号
//		int server_port=sc.nextInt();
//		/*//提示用户输入聊天服务对端开启的端口号
//		System.out.println("请输入聊天服务发送信息对象的目标端口号：");
//		int target_port=sc.nextInt();*/
//		System.out.println("聊天系统初始化完成并启动！！！");
		//创建UDP套接字
		DatagramSocket sender_socket=new DatagramSocket(5000);
		DatagramSocket receiver_socket=new DatagramSocket(3000);
		//分别启动接收端和发送端程序
		new Thread(new ChatReceiver(receiver_socket),"接收服务").start();
		new Thread(new ChatSend(sender_socket,3000),"发送服务").start();
		
			
		

	}

}
