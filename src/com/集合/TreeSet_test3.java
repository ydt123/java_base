package com.集合;

import java.util.Comparator;
import java.util.TreeSet;

@SuppressWarnings("rawtypes")
class MyComparator implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1=(String) obj1;
		String s2=(String) obj2;
		return s1.length()-s2.length();
	}
	
}

public class TreeSet_test3 {

	public static void main(String[] args) {
		@SuppressWarnings("unchecked")
		TreeSet<String> ts=new TreeSet<String>(new MyComparator());
		//若使用TreeSet默认的比较器插入字符串，则会使用字符串类的CompareTo方法
		//按照英文字母或者数字的顺序进行排序插入集合。
		//若使用自定义的比较器MyComparator插入字符串，则会使用自定义的比较器的Compare方法
		//按照字符长度的顺序进行排序插入集合，若长度相同，则TreeSet会认为是同一个元素，无法插入。
		ts.add("Jack");
		ts.add("Eve");
		ts.add("Helena");
		System.out.println(ts);
	}

}
