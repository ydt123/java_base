package com.IO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Paths_test {

	public static void main(String[] args) {
		//使用Paths的get()方法创建Path对象
		Path p=Paths.get("D:\\360Downloads\\Software\\漏洞补丁目录");
		System.out.println("p的根路径是："+p.getRoot());
		System.out.println("p的父路径是："+p.getParent());
		System.out.println("p中的路径名称数是："+p.getNameCount());
		//循环输出路径名称
		for (int i = 0; i < p.getNameCount(); i++) {
			Path zlj=p.getName(i);
			System.out.println("索引为"+i+"的路径名称为："+zlj);
		}
		System.out.println("p的URI路径为："+p.toUri());//URI:网址
		System.out.println("p的绝对路径为："+p.toAbsolutePath());
	}

}
