package com.集合;

import java.util.ArrayList;
import java.util.HashSet;

public class Set_hashSet {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("Jack");
		arrayList.add("Eve");
		arrayList.add("Rose");
		arrayList.add("Rose");
		System.out.println(arrayList);
		
		//HashSet所存储的元素是不可重复的,并且按照字母顺序排好
		//按照字母顺序排好是因为集合里String类重写了CompareTo方法
		//按照数字顺序排好是因为集合里Integer类重写了CompareTo方法
		//不可重复是因为集合里String类重写了hashcode方法和equals方法
		//不可重复是因为集合里Integer类重写了hashcode方法和equals方法
		HashSet<String> set1=new HashSet<String>();
		set1.add("Jack");
		set1.add("Eve");
		set1.add("Rose");
		set1.add("Rose");
		System.out.println(set1);
		
		HashSet<Integer> set2=new HashSet<Integer>();
		set2.add(2);
		set2.add(5);
		set2.add(6);
		set2.add(6);
		System.out.println(set2);

	}

}
