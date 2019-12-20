package com.string;

public class E52 {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		System.out.println("数组a的长度是："+a.length);
		String s="abcabcbacdba.txt";
		//可以将字符串看成一个字符数组，下标从0开始
		System.out.println("字符串s的第一个字符为"+s.charAt(0));
		System.out.println("字符串s的第二个字符为"+s.charAt(1));
		System.out.println("字符串s的长度是"+s.length());
		//字符编码：'A'=65	'a'=97
		System.out.println("字符串s中字符c第一次出现的位置是"+s.indexOf('c'));
		//方法的名字遵循驼峰命名原则：除了第一个英语单词是首字母小写
		//后面的英语单词都是首字母大写
		System.out.println("字符串s中字符c最后一次出现的位置是"+s.lastIndexOf(99));
		
		System.out.println("字符串s中子字符串ab第一次出现的位置是"+s.indexOf("ab"));
		System.out.println("字符串s中子字符串ab最后一次出现的位置是"+s.lastIndexOf("ab"));
		//endsWith是判断以某个字串结尾吗？
		System.out.println("字符串s以.txt结尾吗"+s.endsWith(".txt"));
		//startsWith是判断以某个字串开始吗？
		System.out.println("字符串s以abc开头吗"+s.startsWith("abc"));
		//contains是判断包含某个字串吗？
		System.out.println("字符串s包含子字符串cba吗"+s.contains("cba"));
		//isEmpty是判断是空串吗？
		System.out.println("字符串s是为空串吗"+s.isEmpty());
	}

}
