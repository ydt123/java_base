package com.jr181;

public class E06 {

	public static void main(String[] args) {
		// 逻辑运算符
		int x=0;//定义变量x，初始值为0
		int y=0;//定义变量y，初始值为0
		int z=0;//定义变量z，初始值为0
		boolean a,b;//定义boolean变量a和b
		//&是逻辑与，它的左边x>0 => false,任然要判断右边是真是假
		a=x>0 & y++>1;//逻辑运算符&对表达式进行运算，然后将结果赋值给a
		System.out.println("a="+a);
		System.out.println("y="+y);
		////&是短路与，它的左边x>0 => false,不需要判断右边是真是假
		b=x>0 && z++>1;//逻辑运算符&&对表达式进行运算，然后将结果赋值给b
		System.out.println("b="+b);
		System.out.println("z="+z);
		
		//条件运算符
		int store=50;
		System.out.println(store<=0?"没有库存了！":store>100?"库存太多了！":"库存量为"+store);

	}

}
