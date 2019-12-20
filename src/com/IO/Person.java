package com.IO;

import java.io.Serializable;

public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int age;
	private String name;
	//getter和setter
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//生成字段
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	//超类
	public Person() {
		super();
		// TODO 自动生成的构造函数存根
	}
	@Override
	public String toString() {
		return "age=" + age + ", name=" + name ;
	}
	
}
