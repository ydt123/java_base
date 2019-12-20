package com.jr181;
//在方法的内部自己调用自己，就叫方法的递归，一般来说参数值不一样。
public class Recursive {

	public static int getSum(int n) {
		if(n==1)
		{
			//满足条件，递归结束
			return 1;
		}
		//除了1以外，都加上它前面的元素的和以及元素本身
		int temp=getSum(n-1);
		return temp+n;
		
		
	}
	public static void main(String[] args) {
		System.out.println("1到100的和是"+getSum(100));

	}

}
