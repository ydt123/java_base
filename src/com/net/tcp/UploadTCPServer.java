package com.net.tcp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//服务端线程管理类，用于处理客户端图片上传
class ServerThread implements Runnable{
	private Socket socket;
	public ServerThread(Socket socket) {
		this.socket=socket;
	}
	
	@Override
	public void run() {
		//1.处理客户端请求，进行上传文件保存
		String ip=socket.getInetAddress().getHostAddress();
		//int count=1;
		try {
		//创建图片上传保存目录
		File parentFile=new File("d:\\upload\\");
		if (!parentFile.exists()) {
			parentFile.mkdir();
		}
		//把客户端的IP地址作为上传文件的文件名
		File file=new File(parentFile,ip+".jpg");
		while(file.exists()) {
			file=new File(parentFile,ip+".jpg");
		}
		//通过客户端输入流读取上传文件写入到指定目录
		InputStream in=socket.getInputStream();
		FileOutputStream fos=new FileOutputStream(file);
		byte[] buf=new byte[1024];
		int len=0;
		while((len=in.read(buf))!=-1) {
			fos.write(buf, 0, len);
		}
		//2.服务器端向客户端做出响应，返回信息
		OutputStream out=socket.getOutputStream();
		//out.write("上传成功".getBytes());
		String s=ip+"上传成功";
		buf=s.getBytes();
		//关闭流和Socket连接
		in.close();
		fos.close();
		socket.close();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
}
public class UploadTCPServer {

	public static void main(String[] args) throws Exception {
		//创建指定端口号为10001的服务端ServerSocket对象
		ServerSocket serverSocket=new ServerSocket(8899);
		while(true) {
			//调用accept()方法持续接受客户端请求
			Socket client=serverSocket.accept();
			//针对每一个客户端请求创建一个线程进行连接管理
			new Thread(new ServerThread(client)).start();
		}

	}

}
