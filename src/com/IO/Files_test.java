package com.IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Files_test {

	public static void main(String[] args) throws Exception {
		Path ml=Paths.get("d:/test/sample");
		try {
			Files.createDirectories(ml);
			System.out.println("目录创建成功");
		} catch (IOException e) {
			System.out.println("目录创建失败");
		}
		//创建文件
		Path wj=Paths.get("d:/test/sample/test.txt");
		try {
			Files.createFile(wj);
			System.out.println("文件创建成功");
		} catch (IOException e) {
			System.out.println("文件创建失败");
		}
		//在文件中写入内容
		List list=new ArrayList<>();
		list.add("这是一个测试文件");
		Files.write(wj, list, StandardOpenOption.APPEND);
		//读取文件
		List<String> lines=Files.readAllLines(wj);
		System.out.println("文件的大小为："+Files.size(wj));
		System.out.println("文件中的内容为："+lines);
	}

}
