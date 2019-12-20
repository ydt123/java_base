package com.集合;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

@SuppressWarnings("rawtypes")
class MyComparator2 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String key1=(String) o1;
		String key2=(String) o2;
		/*return key1.compareTo(key2);//升序  */
		return key2.compareTo(key1);//降序
	}
	
}

public class TreeMap_test {

	public static void main(String[] args) {
		// 左边的类或接口必须大于或等于右边的类
		@SuppressWarnings("unchecked")
		Map<String,String> tm = new TreeMap<String,String>(new MyComparator2());
		// Map存储的元素是一个键key+值value=对entry
		tm.put("2", "Lucy");
		tm.put("1", "Jack");
		tm.put("3", "Rose");
		tm.put("1", "Jacky");
		System.out.println(tm);

	}

}
