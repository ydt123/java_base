package com.集合;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Juhecaozuo {

	public static void main(String[] args) {
		//创建一个list集合对象
		List<String> list=new ArrayList<String>();
		list.add("张三");
		list.add("李四");
		list.add("张小明");
		list.add("张阳");
		list.add("张小鱼");
		list.add("张小苗");
		list.add("张小晓");
		//1.创建一个Stream流对象
		Stream<String> stream1=list.stream();
		
		//2.对Stream流中的元素分别进行过滤、截取操作
		Stream<String> stream2=stream1.filter(i->i.startsWith("张"));
		Stream<String> stream3=stream2.limit(2);
		
		//3.对Stream流中的元素进行终结操作，进行遍历输出
		stream3.forEach(j->System.out.println(j));
		System.out.println("================");
		
		//通过链式表达式的形式完成聚合操作
		list.stream().filter(i->i.startsWith("张")).limit(2).forEach(j->System.out.println(j));
		
		System.out.println("================");
		//filter：里面元素的类型是字符串类的子类
		//skip：省略前面几个
		//limit：一共取几个
		//forEach：遍历
		list.stream().filter(y->y.startsWith("张")&&y.length()>2).limit(4).skip(2).forEach(x->System.out.println(x));
		
		List<String> xlb=list.stream().filter(y->y.startsWith("张")).collect(Collectors.toList());
		System.out.println(xlb);
		String s=list.stream().filter(y->y.startsWith("张")).collect(Collectors.joining(","));
		System.out.println(s);
		
	}

}
