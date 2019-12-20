package com.net.tcp;



import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		ServerSocket fwqtjz=new ServerSocket(8899);
		//创建死循环，不断响应客户端的请求
		while(true) {
			//通过服务器套接字获取客户端套接字
			 Socket khdtjz = fwqtjz.accept();
			Thread thread=new Thread(()->{
				try {
				//获取客户端的端口号
				int port=khdtjz.getPort();
				System.out.println("与端口号为"+port+"的客户端连接成功！");
				//要往客户端发送数据，必须所获得的客户端套接字创建输出流
				OutputStream os=khdtjz.getOutputStream();
				String s="你好客户端，来自10.2.103.31这个TCP服务器的问候";
				byte[] b=s.getBytes();
				os.write(b);
				os.close();
				khdtjz.close();
				} catch (Exception e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			});
			thread.start();
			
		}

	}

}
