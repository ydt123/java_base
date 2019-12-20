package com.jr181;

public class Operator {

	public static void main(String[] args) {
		//算术运算符++
		int i=1;
		int j=1;
		System.out.println("先加表达式的值等于变量的值加1，也就是"+(++j));
		System.out.println("后加表达式的值等于变量的值，也就是"+(i++));
		System.out.println("不管先加还是后加,变量的值都加了1，也就是"+j);
		System.out.println("不管先加还是后加,变量的值都加了1，也就是"+i);
		
		//赋值运算符
		int a=2;
		a+=3;//相当于a=a+3
		System.out.println("a="+a);
		
		//比较运算符
		String s1="hello";
		String s2="hello";
		System.out.println(s1==s2);
		Text1 t1=new Text1();
		Text1 t2=new Text1();
		System.out.println(t1==t2);
		
		

	}

}
