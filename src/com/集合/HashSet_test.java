package com.集合;

import java.util.HashSet;

class Student extends Object{
	String id;
	String name;
	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}
	//重写toString()方法
	@Override
	public String toString() {
		return  id + ":" + name ;
	}
	//重写hashCode()方法和equals()方法
	@Override
	public int hashCode() {
		return  id.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		return id.equals(other.id);
	}
}
public class HashSet_test {

	public static void main(String[] args) {
		Student stu1=new Student("1", "mike");
		Student stu2=new Student("1", "mike");
		Student stu3=new Student("3", "tom");
		
		HashSet<Object> hset=new HashSet<Object>();
		hset.add(stu1);
		hset.add(stu2);
		hset.add(stu3);
		System.out.println(hset);

	}

}
