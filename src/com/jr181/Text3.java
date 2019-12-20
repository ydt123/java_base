package com.jr181;

public class Text3 {

	public static void main(String[] args) {
		//自动类型转换：隐式类型转换，从小类型到大类型
		byte b=3;
		int i=b;
		System.out.println("整型变量i的值是"+i);
		
		//强制类型转换：显示类型转换 从大类型到小类型
		//()是强制类型转换符，小括号里是要转换的数据类型
		int  i2=257;
		byte b2=(byte)i2;
		System.out.println("整型变量i2的值是"+i2);
		System.out.println("字节型变量b2的值是"+b2);
		
		int  i1=2;
		byte b1=(byte)i1;
		System.out.println("整型变量i1的值是"+i1);
		System.out.println("字节型变量b1的值是"+b1);

	}

}
