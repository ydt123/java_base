package com.集合;

import java.util.Arrays;

public class Arrays_tool {

	public static void main(String[] args) {
		int arr[]= {9,8,3,5,2};//初始化一个数组
		System.out.println("排序前：");
		printArray(arr);//打印原数组
		//1.使用sort()方法排序
		Arrays.sort(arr);//调用Arrays的sort()静态方法排序
		System.out.println("\n排序后：");
		printArray(arr);//打印排序后数组
		
		//2.使用binarySearch(Object[]a, Object key)方法查找元素
		int index=Arrays.binarySearch(arr, 3);//查找指定元素3
		System.out.println("\n元素3的索引是："+index);
		
		//3.使用copyOfRange(original, from, to)方法拷贝元素
		System.out.println("拷贝元素后：");
		int[]copied=Arrays.copyOfRange(arr, 1, 7);//拷贝一个指定范围的数组
		/*for (int i = 0; i < copied.length; i++) {
			System.out.print(+copied[i]+" ");
		}*/
		printArray(copied);
		
		//4.使用fill(a, val)方法替换元素
		System.out.println("\n拷贝元素后：");
		Arrays.fill(arr,8);//用8替换数组中每个元素
		/*for (int i = 0; i < arr.length; i++) {
			System.out.println(i+":"+arr[i]);
		}*/
		printArray(arr);

	}
	//定义打印数组元素的方法
	private static void printArray(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			int j = arr[i];
			System.out.print(j+" ");
			
		}
		
	}

}
