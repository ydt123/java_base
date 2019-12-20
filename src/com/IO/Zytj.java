package com.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Zytj {
	static HashMap<String,Integer> hm=new HashMap<>();
	public static void main(String[] args) throws Exception {
		
		FileInputStream fin=new FileInputStream("18rj1.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(fin));
		String xsm=br.readLine();
		while(xsm!=null) {
			hm.put(xsm,0);
			xsm=br.readLine();
		}
		//System.out.println(hm);
		
		File file=new File("D:\\18软件1班作业");
		FileDir(file);
		System.out.println(hm);
		
	}
	private static void FileDir(File file) {
		File[] listFiles=file.listFiles();
		//当前文件夹下面的每一个文件f
		for(File f:listFiles) {
			//如果遍历的是目录，则递归调用FileDir()方法
			if(f.isDirectory()) {
				String wjm=f.getName();
				hm.forEach((xsm,cs)->{
					if(wjm.contains(xsm)) {
						cs=cs+1;
						hm.put(xsm, cs);
					}
				});
				FileDir(f);
			}
			
		}

		
	}


}
