package com.jr181;

public class Overload_text {
	public static void main(String[] args) {
		//如果一个方法是静态方法，那么可以直接用类名来引用
		System.out.println(Overload.add(1, 2));
		System.out.println(Overload.add(3, 4, 7));
		//不管方法是不是静态的，都可以用对象名来引用
		Overload o1=new Overload();
		System.out.println(o1.add(1.2, 2.5));

	}
}
