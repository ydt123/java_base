package com.tostring;

//定义Animal类
class Animal extends java.lang.Object{
	void shout() {
		System.out.println("动物叫");
	}
	
	//重写object类的toString()方法
	@Override
	public String toString() {
		return"这是一只动物";
	}
	
	
}

//定义Dog类
class Dog extends Animal{
	@Override
	public String toString() {
		return"这是一只小狗";
	}
	
	
}


//定义测试类
public class E06 {

	public static void main(String[] args) {
		Animal dw=new Animal();
		Dog xg=new Dog();
		System.out.println(dw);//输出对象=输出对象.toString()
		System.out.println(xg.toString());

	}

}
