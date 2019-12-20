package com.interface_;
//接口编译后也是class文件

//定义Animal接口
interface  Animal{
	//接口中没有成员变量
	//只有public static final的成员常量
	//public static final三个关键字可以省略
	public static final int ID=1;
	//abstract:抽象
	//接口中的方法都是public abstract
	//public abstract两个关键字可以省略
	void shout();
	//接口里可以有静态非抽象的方法
	static int getID() {
		return Animal.ID;
	}
	
}

interface LandAnimal extends Animal{
	void run();
}

//定义Dog类实现抽象类Animal
class Dog implements LandAnimal{
	//必须重写父类中的抽象类
	@Override
	public void shout() {
		System.out.println("汪汪~");
	}

	@Override
	public void run() {
		System.out.println("小狗崽哼哧哼哧的跑过来");
		
	}
	
}

//定义测试类
public class E13 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.shout();//调用dog对象的shout()方法
		dog.run();//调用dog对象的run()方法
		System.out.println(Animal.getID());
	}

}