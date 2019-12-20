package com.polymorphism_;
//定义抽象类Animal
abstract class Animal{
	abstract void shout();//定义抽象shout()方法
}

//定义Cat类继承Animal抽象类
class Cat extends Animal{
	@Override
	//实现shout()方法
	void shout() {
		System.out.println("喵喵~");
	}
	public void catchMouse() {
		System.out.println("小猫捉老鼠");
	}
}

//定义Dog类继承Animal抽象类
class Dog extends Animal{
	@Override
	//实现shout()方法
	void shout() {
		System.out.println("汪汪~");
	}
}

//定义测试类
public class E15 {

	public static void main(String[] args) {
		Animal an1=new Cat();
		an1.shout();
		Animal  an2=new Dog();
		an2.shout();
		//对象 instanceof 类 	instanceof关键字表示左边对象是右边类的实例
		if(an1 instanceof Cat) {
			Cat mao=(Cat)an1;
			mao.catchMouse();
		}else {
			System.out.println("该类型的对象不是Cat类型");
		}
		
		if(an2 instanceof Cat) {
			Cat mao=(Cat)an1;
			mao.catchMouse();
		}else {
			System.out.println("该类型的对象不是Cat类型");
		}

	}

}
