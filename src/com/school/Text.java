package com.school;

public class Text {

	public static void main(String[] args) {
		// Student是类名  s1是这个类的对象名
		//new关键字用来创建一个Student类，类名后面要有小括号
		//创建对象：类名 对象名=new 构造方法；
		Student s1=new Student();
		s1.setName("恒PP");
		s1.setScore(700);
		System.out.println(s1.getName()+"考了"+s1.getScore()+"分");
		Student s2=new Student("祁晏",749);
		System.out.println(s2.getName()+"考了"+s2.getScore()+"分");
		
		Course c1=new Course();
		c1.setCourse_name("java程序设计");
		c1.setCourse_book("java基础入门");
		System.out.println(c1.getCourse_name()+"这门课使用的教材是《"+c1.getCourse_book()+"》");
		
	}
	

}
