package com.school;

public class Student {
	//定义两个成员变量
	//private:类可见性 当前属性只能在本类中被访问
	private String name;//字符串类型的姓名
	//没有修饰符：包可见性 当前属性只能在本包中被访问
	private int score;//整型的成绩
	//set:设置   	 get:获取
	
	//如果没有定义任何构造方法，java虚拟机就会自动创建一个无参的构造方法
	//如果有了带参数的构造方法，java虚拟机将不会自动创建一个无参的构造方法
	//不管什么情况，都给类添加一个无参数的构造方法
	//定义无参的构造方法：
	//构造方法是一种特殊的构造方法：修饰符+类名([参数类型 参数名,参数类型 参数名]){}
	public Student() {}
	//定义有参的构造方法：
	public Student(String name,int score) {
		this.name = name;
		this.score = score;
	}
	//2对getter setter方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}
