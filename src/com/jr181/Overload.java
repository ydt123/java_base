package com.jr181;
//在一个类里，若干个方法的名字相同，这些名字相同的方法，或参数个数不一样，
//或参数类型不一样，或返回值类型不一样，就叫方法的重载。
public class Overload {
	//1.两个整数的加法
	public static int add(int x,int y) {
		return x+y;
	}
	//2.三个整数的加法
	public static int add(int x,int y,int z) {
			return x+y+z;
	}
	//3.两个浮点型小数的加法
	public static double add(double x,double y) {
			return x+y;
	}
	
	

}
