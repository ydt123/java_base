package com.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStream_test {

	public static void main(String[] args) throws IOException {
		FileInputStream fin=new FileInputStream("d:\\src.jpg");
		FileOutputStream fout=new FileOutputStream("d:\\dest.jpg");
		
		long beginTime=System.currentTimeMillis();
		byte[] zjhc=new byte[1024];
		int b=fin.read(zjhc);
		while(b!=-1) {
			//System.out.print(b+" ");
			fout.write(zjhc,0,b);
			b=fin.read(zjhc);
		}
		//String string=",com on";
		//fout.write(string.getBytes());
		long endTime=System.currentTimeMillis();
		System.out.println("拷贝这张图片花费时间为："+(endTime-beginTime)+"毫秒");
		fin.close();
		fout.close();
	}

}
