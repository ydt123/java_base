package com.string;

public class E54 {

	public static void main(String[] args) {
		String s="     http:// localhost  :   8080     ";
		//去除两端空格
		System.out.println("去除字符串两端空格后的结果："+s.trim());
		//去除所有空格：把空格字符串转换为空字符串
		System.out.println("去除字符串两端空格后的结果："+s.replace(" ", ""));
		//用正则表达式去除所有空格
		//第一个斜杠(\)表示转义字符，\s--空格符
		System.out.println("去除字符串两端空格后的结果："+s.replaceAll("\\s+", ""));
	}

}
