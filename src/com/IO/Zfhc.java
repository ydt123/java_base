package com.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Zfhc {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("d:\\reader.txt");
		FileWriter fw=new FileWriter("d:\\writer.txt");
		long beginTime=System.currentTimeMillis();
		char[] buff=new char[1024];
		int len=fr.read(buff);//buff:
		while(len!=-1) {
			fw.write(buff,0,len);
			len=fr.read(buff);
		}
		long endTime=System.currentTimeMillis();
		System.out.println("拷贝这个文件花费时间为："+(endTime-beginTime)+"毫秒");
		fr.close();
		fw.close();
	}

}
