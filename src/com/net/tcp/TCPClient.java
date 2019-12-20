package com.net.tcp;


import java.io.File;
import java.io.InputStream;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) throws Exception {
		//创建客户端套接字，参数是服务器的IP地址和开放的端口号，连接服务器
		Socket khdtjz=new Socket("10.2.103.31", 8899);
		//创建文件
		File wj=new File("d:\\1.jpg");
		//客户端要接收数据，通过套接字获取输入流
		InputStream is=khdtjz.getInputStream();
		byte[] zjhc=new byte[1024];
		int b=is.read(zjhc);
		while(b!=-1) {
			System.out.println(new String(zjhc,0,b));
			b=is.read(zjhc);
		}
		//关闭流和socket连接
		is.close();
		khdtjz.close();
	}

}
