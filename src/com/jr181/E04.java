package com.jr181;

public class E04 {

	public static void main(String[] args) {
		//变量的作用域
		int x=12;//定义变量x
		{
			int y=96;//定义变量y
			System.out.println("x="+x);
			System.out.println("y="+y);
		}
		System.out.println("x="+x);
		
	}

}
