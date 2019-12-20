package com.net.tcp;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class UploadTCPClient {

	public static void main(String[] args) throws  Exception {
		//创建一个Socket并连接到指定的服务器端
		Socket client=new Socket("10.2.103.87  ", 8899);
		//1.客户端向服务端上传文件
		OutputStream out=client.getOutputStream();
		FileInputStream fis=new FileInputStream("d:\\1.jpg");
		byte[] buf=new byte[1024];
		int len=0;
		System.out.println("连接到服务器端，开始上传文件！");
		while((len=fis.read(buf))!=-1) {
			out.write(buf, 0, len);
		}
		//图片上传完成后及时关闭客户端输出流
		client.shutdownOutput();
		//2.客户端接受服务端的响应信息
		InputStream is=client.getInputStream();
		byte[] bufMsg=new byte[1024];
		int len2=is.read(bufMsg);
		while(len2!=-1) {
			System.out.println(new String(bufMsg,0,len2));
			len2=is.read(bufMsg);
		}
		//关闭流和Socket连接
		out.close();
		is.close();
		fis.close();
		client.close();
	}

}
