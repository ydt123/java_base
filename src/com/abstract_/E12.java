package com.abstract_;

//定义抽象类Animal
abstract class Animal{
	//定义抽象方法shout()
	public abstract void shout();//abstract:抽象
}

//定义Dog类继承抽象类Animal
class Dog extends Animal{
	//必须重写父类中的抽象类
	@Override
	public void shout() {
		System.out.println("汪汪~");
	}
	
}

//定义测试类
public class E12 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.shout();//调用dog对象的shout()方法

	}

}
