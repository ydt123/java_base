package com.string;

public class Test_5 {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("HelloWorld");
		String dglzfc=s.reverse().toString();
		System.out.println(dglzfc);//dglzfc--倒过来字符串
		
		StringBuffer kc= new StringBuffer();
		char[] zfsz=dglzfc.toCharArray();//zfsz--字符数组
		for (int i = 0; i < zfsz.length; i++) {
			char c=zfsz[i];
			if (Character.isUpperCase(c)) {
				String dxbxx=(""+c).toLowerCase();
				kc.append(dxbxx);//dxbxx--大写变小写
			} else if (Character.isLowerCase(c)) {
				String dxbxx=(""+c).toUpperCase();
				kc.append(dxbxx);
			} 
		}
		System.out.println(kc);
		
		

	}

}
