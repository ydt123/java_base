package com.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class File1 {

	public static void main(String[] args) throws Exception {
		File file=new File("example.txt");
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
		bw.write("hello,18软件1班的崽崽们!");//UTF-8中文：一个汉字站3个字节
		bw.flush();
		bw.close();
		
		System.out.println("文件名称："+file.getName());
		System.out.println("文件的相对路径："+file.getPath());
		System.out.println("文件的绝对路径："+file.getAbsolutePath());
		System.out.println("文件的父路径："+file.getParent());
		System.out.println(file.canRead()?"文件可读":"文件不可读");
		System.out.println(file.canWrite()?"文件可写":"文件不可写");
		System.out.println(file.isFile()?"是一个文件":"不是一个文件");
		System.out.println(file.isDirectory()?"是一个目录":"不是一个目录");
		System.out.println(file.isAbsolute()?"是绝对路径":"不是绝对路径");
		long zhxgsjc=file.lastModified();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年mm月dd日  hh:mm:ss");
		System.out.println("最后修改时间为："+sdf.format(new Date(zhxgsjc)));
		System.out.println("文件大小为："+file.length()+" bites");
		System.out.println("是否成功删除文件："+file.delete());

	}

}
