package com.string;

public class E53 {

	public static void main(String[] args) {
		String str="j1宝a贝30恒v3ad5想f3你ws93a8d了2g0";
		char[] charArray=str.toCharArray();
		System.out.print("将字符串转为字符数组的遍历结果：");
		for(int i=0;i<charArray.length;i++) {
			if(i!=charArray.length-1) {
				//如果不是数组的最后一个元素，在元素后面加逗号
				System.out.print(charArray[i]+",");
			}else {
				//数组的最后一个元素后面不加逗号
				System.out.println(charArray[i]);
			}
		}
		
		/*int i=0;
		//foreach循环
		for(char zf:charArray) {
			i++;
			//System.out.println(str.indexOf(zf));
		//	System.out.println(str.length()-1);
		if(str.endsWith(""+zf)&&i==str.length()) 
				System.out.print(zf);
			else 
				System.out.print(zf+",");
			
		}*/
		
		System.out.print("字符串中的数字是：");
		//foreach循环
		//'0'=49,'A'=65,'a'=97
		for(char zf:charArray) {
			if(zf>='0'&&zf<='9') {
				System.out.print(zf);
			}
		}
		
		System.out.print("\n字符串中的汉字是：");
		//foreach循环
		//汉字的编码范围：4E00-9FA5
		for(char zf:charArray) {
			if(zf>='\u4E00'&&zf<='\u9FA5') {
				System.out.print(zf);
			}
		}
		
		System.out.println("\n将int值转换为string类型之后的结果："+String.valueOf(12));
		System.out.println("将字符串转换为大写之后的结果："+str.toUpperCase());

	}

}
