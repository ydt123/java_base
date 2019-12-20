package com.string;

public class E55 {

	public static void main(String[] args) {
		String str="2019-10-12";
		//substring()方法用于截取字符串的一部分
		System.out.println("今天是"+str.substring(8)+"号");
		System.out.println("今天是"+str.substring(5,7)+"月");
		System.out.println("今天是"+str.substring(0,4)+"年");
		//split()方法将字符串按照某个字符进行分割
		String[] strArray=str.split("-");//用"-"分割
		System.out.println("今天是"+strArray[0]+"年"+strArray[1]+"月"+strArray[2]+"日");
		
		for(int i=0;i<strArray.length;i++)
		{
			System.out.println(strArray[i]);
		}
		
		//循环输出数组中的元素
		System.out.print("今天是：");
		for(int i=0;i<strArray.length;i++)
		{
			if(i!=strArray.length-1)
			{
				System.out.print(strArray[i]+"/");
			}else {
				System.out.print(strArray[i]);
			}
			
		}

	}

}
