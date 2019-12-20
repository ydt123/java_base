package com.string;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class E58 {

	public static void main(String[] args) {
		String str="j1宝a贝30恒v3ad5想f3你ws93a8d了2g0";
		StringBuffer zfchc=new StringBuffer();
		char[] charArray=str.toCharArray();
		for(char zf:charArray) {
			if(zf>='\u4e00'&& zf<='\u9fa5') {
				zfchc.append(zf);
			}
		}
		System.out.println(zfchc);
		
		//添加
		zfchc.append("!");
		System.out.println(zfchc);
		//插入
		zfchc.insert(3,',');
		System.out.println(zfchc);
		//删除
		zfchc.delete(2, 3);
		System.out.println(zfchc);
		//替换
		zfchc.replace(2, 3, "弟弟");
		System.out.println(zfchc);
	}
	
	
}
