package com.jr181;

public class Fibonacci {
	public static int F(int n) {
		//return语句在方法中执行后，方法将终止，不再执行return后面的语句。
		//当n=1,n=2时
		if(n==1)return 1;
		if(n==2)return 1;
		//当n>=3时
		return F(n-1)+F(n-2);
		
	}

	public static void main(String[] args) {
		System.out.println("Fibonacci sequence的第6个数的值是"+F(6));

	}

}
