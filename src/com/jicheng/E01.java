package com.jicheng;
//定义动物类
class Animal{
	String name;
	
	public Animal() {
		System.out.println("我是一只动物");
	}
	
	public Animal(String name) {
		System.out.println("恒恒是一只"+name);
	}
	
	void shout() {
		System.out.println("动物发出叫声");
	}
}
//定义dog类继承Animal类
class Dog extends Animal{
	
	public Dog() {
		super("金毛");
	}
	
	//继承了Animal类所有可以继承的方法和成员变量
	void printName() {
		System.out.println("name="+name);
	}
	@Override//重写  前面Override是注释
	void shout() {
		super.shout();//super用来指代父类
		System.out.println("汪汪~");
	}
}

public class E01 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		/*dog.name="金毛";
		dog.printName();//调用自己的方法
		dog.shout();//调用父类的方法
		*/
	}

}
