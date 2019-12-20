package com.集合;

import java.util.TreeSet;

public class TreeSet_test {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();//<>:参数化类型
		ts.add(13);
		ts.add(8);
		ts.add(17);
		ts.add(25);
		ts.add(15);
		ts.add(11);
		ts.add(1);
		System.out.println("创建的TreeSet集合为："+ts);
		System.out.println("TreeSet集合首元素为："+ts.first());
		System.out.println("TreeSet集合尾部元素为："+ts.last());
		System.out.println("TreeSet集合中大于9的最小元素为："+ts.higher(9));
		System.out.println("TreeSet集合中小于15的最大元素为："+ts.lower(15));
		System.out.println("TreeSet集合中大于等于10的最小元素为："+ts.ceiling(10));
		System.out.println("TreeSet集合中小于等于25的最大元素为："+ts.floor(25));
		ts.pollFirst();
		System.out.println("删除第一个元素后TreeSet集合为："+ts);
		ts.pollLast();
		System.out.println("删除第一个和最后一个元素后TreeSet集合为："+ts);

	}

}
