package com.net.chart;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ChatReceiver implements Runnable {
	private DatagramSocket server;

	public ChatReceiver(DatagramSocket server) {
		this.server = server;
	}

	@Override
	public void run() {

		try {
			// 准备字节数组，1024个字节大小
			byte[] zjsz = new byte[1024];
			// 创建数据报，用于接收数据
			DatagramPacket dp = new DatagramPacket(zjsz, zjsz.length);

			// 创建死循环，不停接收数据
			while (true) {
				// 通过套接字接收数据报
				server.receive(dp);
				// 将数据报中的内容get出来，并转换为字符串
				String neirong = new String(dp.getData(), "UTF-8");
				System.out.println("收到" + dp.getAddress().getHostAddress() + ":"  + "发送的数据：" + neirong);
			}
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}

}
