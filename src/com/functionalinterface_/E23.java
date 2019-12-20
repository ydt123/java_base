package com.functionalinterface_;
//定义无参数、无返回值的函数式接口,有且仅有一个抽象方法。
@FunctionalInterface
interface Animal{
	void shout();
}

//定义有参数、有返回值的函数式接口，有且仅有一个抽象方法。
@FunctionalInterface
interface Calculate{
	int sum(int x,int y);
}

public class E23 {

	public static void main(String[] args) {
		//通过lambda表达式调用方法
		animalShout(()->System.out.println("无参数、无返回值的函数式接口调用"));
		showSum(10,20,(x,y)->x+y);

	}

	private static void showSum(int x, int y, Calculate c) {
		System.out.println(x+"+"+y+"="+c.sum(x,y));
	}

	private static void animalShout(Animal an) {
		an.shout();
	}

}
