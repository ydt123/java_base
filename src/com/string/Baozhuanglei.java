package com.string;

public class Baozhuanglei {

	public static void main(String[] args) {
		//定义一个基本类型的变量a
		int a=20;
		//自动装箱：将基本数据类型数据转成引用数据类型数据
		Integer b=a;
		//自动拆箱：将引用数据类型数据转成基本数据类型数据
		int c=b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//将字符串转变为整数的3种方法
		String s="88";
		String s1=s+10;
		System.out.println("字符串连接的结果是："+s1);
		System.out.print("\nNO.1通过包装类的valueOf()方法：");
		int i_1=Integer.valueOf(s);
		System.out.print(i_1+10);
		System.out.print("\nNO.2通过包装类的parseXxx()方法：");
		int i_2=Integer.parseInt(s);
		System.out.print(i_2+10);
		System.out.print("\nNO.3通过包装类的构造方法：");
		int i_3=new Integer(s);
		System.out.print(i_3+10);
		
		//将字符串转变为整数的3种方法
		Integer j=88;
		System.out.print("\n\nNO.1通过String类的valueOf()方法：");
		String s_1=String.valueOf(j);
		System.out.print(s_1);
		System.out.print("\nNO.2通过包装类的toString()方法：");
		String s_2=j.toString(j);
		System.out.print(s_2);
		System.out.print("\nNO.3通过空串连接整数的方法：");
		String s_3=""+j;
		System.out.print(s_3);
				
		

	}

}
