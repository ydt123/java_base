package com.inner_class;
interface Animal{
	void shout();
}
class Cat implements Animal{
	@Override
	public void shout() {
		System.out.println("喵喵~");
	}
	
}

public class E21 {

	public static void main(String[] args) {
		String name="卫崽崽";
		//第一种方式：
		//外部类 外部类的对象=new 外部类()创建对象
		Cat cat=new Cat();
		//外部类的对象.方法名 来调用方法实现功能
		cat.shout();
		
		//第二种方式：
		//匿名内部类：作为方法的参数，有具体的实现语句
		animalshout(new Animal() {
			
			@Override
			public void shout() {
				System.out.println("喵喵~");
				
			}
		});
		//第三种方式：
		//用lambda表达式作为参数传递给animalShout方法
		//()对应shout方法后面的括号，->是表达式箭牌，{}里面的语句是方法主体
		animalshout(()->System.out.println(name+"喵喵~"));
	}

	private static void animalshout(Animal an) {
		an.shout();
	}

}
