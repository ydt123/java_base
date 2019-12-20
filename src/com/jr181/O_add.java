package com.jr181;

public class O_add {

	public static void main(String[] args) {
		// 计算1+3+5+7+...+99的值
		
		int sum=0;
		//i+=2 => i=i+2
		for(int i=1;i<=99;i+=2) {
		 sum+=i;
		}
		System.out.println("sum="+sum);
	}

}
