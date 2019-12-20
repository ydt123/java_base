package com.集合;

public class Foreach_test {
	static String[] strs= {"aaa","bbb","ccc"};
	public static void main(String[] args) {
		// 1.foreach循环遍历数组
		for (String mgys : strs) {
			mgys="ddd";//mgys:每个元素
		}
		System.out.println("foreach循环修改后的数组："+strs[0]+","+strs[1]+","+strs[2]);
		// 2.for循环遍历数组
		for (int i = 0; i < strs.length; i++) {
			strs[i]="ddd";
		}  
		System.out.println("for循环修改后的数组："+strs[0]+","+strs[1]+","+strs[2]);
	}
	

}
