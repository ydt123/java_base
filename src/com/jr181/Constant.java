package com.jr181;

public class Constant {

	public static void main(String[] args) {
		// 整型常量198
		System.out.println("二进制以0b开头"+0b11000110);
		System.out.println("八进制以0开头"+0306);
		//十六进制：123456789abcdef
		System.out.println("十六进制以0x开头"+0xc6);
		
		//浮点数后面的f表示单精度浮点数
		System.out.println("2e3f="+2e3f);
		System.out.println("5.022f="+5.022f);
		System.out.println("5.022e+5f="+5.022e+5f);
		//浮点数后面的d表示单双度浮点数，这个d可以不写
		System.out.println("5.022e+8d="+5.022e+8d);
		System.out.println("5.022e+6="+5.022e+6);
		
		//字符常量
		System.out.println("我的名字是"+'\u664f'+'\u4e1c'+'\u5a77');
		
		//字符串常量
		System.out.println("welcom,\n ydt");
		
		//布尔常量
		System.out.println("布尔常量"+false+"或"+true);
		
		//null常量
		System.out.println("引用数据类型"+null);
		//基本数据类型的变量不能赋值为null
		int a=5;
		//a=null;
		//引用数据类型可以赋值为null
		Constant Constant=new Constant();
		Constant=null;
		
		//如果在类型的前面加上final关键字作为修饰符，那么被修饰的变量就成为常量
		//他不是字面意义上的常量 ，不可改变
		
		final int d=6;
	}
}
