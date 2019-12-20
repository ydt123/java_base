package com.IO;

import java.io.RandomAccessFile;

public class RandomAccessFile_text {

	public static void main(String[] args) throws Exception {
		//创建RandomAccessFile对象，并以读写模式打开times.txt文件
		RandomAccessFile raf=new RandomAccessFile("times.txt","rw");
		int times=Integer.parseInt(raf.readLine())-1;
		//判断剩余次数
		if(times>0) {
			System.out.println("您还可以试用"+times+"次！");
			raf.seek(0);//将记录指针重新指向文件开头
			raf.write((times+"").getBytes());//将剩余次数再次写入文件
		}else {
			System.out.println("试用次数已近用完！");
		}
		raf.close();//关闭这个随机存取文件流并释放任何系统

	}

}
