package com.IO;

import java.io.RandomAccessFile;

public class FileChannel {

	public static void main(String[] args) throws Exception {
		RandomAccessFile yswj=new RandomAccessFile("d:/ewm.jpg","rw");
		RandomAccessFile mbwj=new RandomAccessFile("d:/ewm1.jpg","rw");
		
		java.nio.channels.FileChannel finc=yswj.getChannel();
		java.nio.channels.FileChannel foutc=mbwj.getChannel();
		long wjdx=finc.transferTo(0,finc.size(), foutc);
		if(wjdx>0) {
			System.out.println("复制成功");
		}
		yswj.close();
		mbwj.close();
		finc.close();
		foutc.close();
	}

}
