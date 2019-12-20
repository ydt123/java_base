package com.集合;

import java.util.ArrayList;
import java.util.Iterator;

public class Diedai {

	public static void main(String[] args) {
		//ArrayList是集合类，<>里面的String是集合里元素的类型
		ArrayList<String> list=new ArrayList<String>();
		list.add("s1");
		list.add("s2");
		list.add("s3");
		list.add("s4");
		//1.lambda表达式遍历集合里每个元素
		System.out.println("1.lambda表达式遍历集合里每个元素：");
		list.forEach(duixiang->System.out.print(duixiang+" "));
		
		//2.通过迭代遍历集合里每个元素
		System.out.println("\n2.通过迭代遍历集合里每个元素：");
		Iterator<String> diedai=list.iterator();
		//hasNext()是一个判断，通过迭代对象判断有下一个元素吗？
		while (diedai.hasNext()) {
			Object mgys = (Object) diedai.next();//取出Arraylist集合里的元素
			System.out.print(mgys+" ");//mgys:每个元素
			
		}
		
		//3.针对迭代器通过lambda表达式遍历集合里每个元素
		System.out.println("\n3.针对迭代器通过lambda表达式遍历集合里每个元素：");
		Iterator<String> diedai2=list.iterator();
		diedai2.forEachRemaining(duixiang->System.out.print(duixiang+" "));
		
		//4.通过foreach循环遍历集合里每个元素
		System.out.println("\n4.通过foreach循环遍历集合里每个元素：");
		//foreach循环输出
		for (String dgys : list) {//dgys:单个元素
			System.out.print(dgys+" ");
		}

	}

}
