package com.集合;

import java.util.TreeSet;

@SuppressWarnings("rawtypes")
class Teacher implements Comparable{
	String name;
	int age;
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + ":" + age ;
	}
	@Override
	public int compareTo(Object obj) {
		Teacher teacher=(Teacher) obj;
		return this.age-teacher.age;//升序
	 /* return teacher.age-this.age;//降序    
     */	
		}
	
}

public class TreeSet_test2 {

	public static void main(String[] args) {
		TreeSet<Teacher> ts=new TreeSet<Teacher>();
		ts.add(new Teacher("陈勇军", 30));
		ts.add(new Teacher("梅方", 31));
		ts.add(new Teacher("张丽平", 32));
		ts.add(new Teacher("梅方", 31));
		System.out.println(ts);

	}

}
