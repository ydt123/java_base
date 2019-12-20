package com.string;
import java.io.IOException;

public class String_Runtime {

	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime rt=Runtime.getRuntime();
		System.out.println("处理器的个数："+rt.availableProcessors()+"个");
		System.out.println("空闲内存大小："+rt.freeMemory()/1024/1024+"M");
		System.out.println("最大可用内存大小："+rt.maxMemory()/1024/1024+"M");
		
		//调用系统命令`
		Process process=rt.exec("notepad.exe");
		//程序休眠3秒
		Thread.sleep(3000);
		//关闭进程
		process.destroy();
		
		
	}

}
