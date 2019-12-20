package com.gc;
class Person extends Object{
	//重写父类object中的finalize()方法
	@Override
	public void finalize() {
		System.out.println("对象将被作为垃圾回收......");
	}
}
public class E37 {

	public static void main(String[] args) {
		huishoulaji1();
		System.out.println("=================");
		huishoulaji2();
	}

	//1.演示一个不通知强制垃圾回收的方法
	private static void huishoulaji1() {
		Person p1=new Person();
		p1=null;//使p1对象为空，也就是不再使用，成为垃圾
		int i=1;
		while(i<10) {
			System.out.println("方法1循环中......");
			i++;
		}
		
	}
	
	//2.演示一个通知强制垃圾回收的方法
	private static void huishoulaji2() {
		Person p2=new Person();
		p2=null;//使p2对象为空，也就是不再使用，成为垃圾
		System.gc();//强制回收垃圾
		//Runtime.getRuntime().gc();
		int i=1;
		while(i<10) {
			System.out.println("方法2循环中......");
			i++;
		}
		
	}

}
