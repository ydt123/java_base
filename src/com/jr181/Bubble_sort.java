package com.jr181;

public class Bubble_sort {

	public static void main(String[] args) {
		// 数组的特征是中括号，这个中括号可以在数组名的前面或后面
		// 可以有空格，也可以没有空格，但一定要在数据类型的后面
		int a[]= {9,8,3,5,2};
		System.out.println("数组a的长度是"+a.length);
		// 数组下标的最大值是数组长度减1
		
		//冒泡排序
		System.out.print("初始数组各个元素是：");
		/*for (int i=0;i<a.length;i++){
			System.out.print(a[i]+"  "); // ""里是两个空格号，将数组元素隔开
		}*/
		// foreach循环
		for(int xiaoa:a) {
			System.out.print(xiaoa+"  ");
		}
		
		// 外循环定义趟数
		for(int i=1;i<a.length;i++) {
			// 内循环模拟每一趟的比较
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.print("\n冒泡排序结束后各个元素是：");// \n => 换行
		/*for (int i=0;i<a.length;i++){
			System.out.print(a[i]+"  ");
		}*/
		
		// foreach循环     ":"读作 each in
		for(int xiaoa:a) {
			System.out.print(xiaoa+"  ");
		}
	}

}
