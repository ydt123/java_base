package com.集合;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collection_test {

	public static void main(String[] args) {
		//1.创建ArrayList集合,<>表示泛型，也就是集合里元素的类型
		ArrayList<String> list=new ArrayList<String>();
		//向集合中添加元素
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		System.out.println("集合的长度："+list.size());
		System.out.println("第二个元素是："+list.get(1));
		
		//2.创建LinkedList集合
		LinkedList<String> list2=new LinkedList<String>();
		list2.add("s1");
		list2.add("s2");
		System.out.println(list2);
		list2.offer("offer");//offer:向集合尾部追加元素
		list2.push("push");//push:向集合头部添加元素
		System.out.println(list2);
		System.out.println("第一个元素是："+list2.get(0));
		System.out.println("第一个元素是："+list2.peek());
		list2.removeFirst();//删除集合第一个元素
		list2.pollLast();//删除集合最后一个元素
		System.out.println(list2);
		

	}

}
