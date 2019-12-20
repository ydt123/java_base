package com.net;

import java.net.InetAddress;

public class Net_test1 {

	public static void main(String[] args) throws Exception {
		InetAddress localAddres=InetAddress.getLocalHost();
		InetAddress baiduAddres=InetAddress.getByName("www.baidu.com");
		System.out.println("本机的IP地址："+localAddres.getHostAddress());
		System.out.println("百度服务器的IP地址："+baiduAddres.getHostAddress());
		System.out.println("3秒内是否可以访问："+baiduAddres.isReachable(3000));
		System.out.println("百度的主机名为："+baiduAddres.getHostName());
	}

}
