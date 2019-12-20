package com.string;

public class Sring_StringBuffer {

	public static void main(String[] args) {
		String s1=new String("abc");
		String s2=new String("abc");
		//equals:与...相等，等于
		if (s1.equals(s2)) {	
			System.out.println("s1与s2相等");
		}
		StringBuffer sb1=new StringBuffer("abc");
		StringBuffer sb2=new StringBuffer("abc");
		if (!sb1.equals(sb2)) {
			System.out.println("sb1与sb2不相等");
		}
		
		
	}

}
