package com.IO;

import java.io.File;
import java.io.FileDescriptor;
import java.util.Arrays;

public class Traverse_directory_test {

	public static void main(String[] args) {
		File file=new File("E:\\2019年下旬\\Java\\3\\java_base\\src\\com\\string");
		/*if(file.isDirectory()) {
			String[] FileNames=file.list((dir,name)->name.endsWith(".java"));
			Arrays.stream(FileNames).forEach(f->System.out.println(f));
		}*/
		FileDir(file);

	}

	private static void FileDir(File file) {
		File[] listFiles=file.listFiles();
		//当前文件夹下面的每一个文件f
		for(File f:listFiles) {
			//如果遍历的是目录，则递归调用FileDir()方法
			if(f.isDirectory()) {
				FileDir(f);
			}
			//如果遍历的是文件，则输出文件路径
			System.out.println(f);
		}

		
	}

}
