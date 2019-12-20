package com.jr181;

public class Text2 {

	public static void main(String[] args) {
		byte b=1;//00000001
		short s=1;//00000000 00000001
		int i=1;//00000000 00000000 00000000 00000001
		long l=1;//00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000001
		float f=1.0f;//表示单精度的1.0，后面一定要写f
		double d=1.0;//双精度：1.0默认用64位的double类型来表示
		char c='a';
		short sc=97;
		char cc=97;
		boolean b1=false;
		boolean b2=true;
		
		System.out.println(c);
		System.out.println(sc);
		System.out.println(cc);
		
		
		
		System.out.println("字节型整型数据的长度"+Byte.SIZE);
		System.out.println("短整型整型数据的长度"+Short.SIZE);
		System.out.println("整型数据的长度"+Integer.SIZE);
		System.out.println("长整型整型数据的长度"+Long.SIZE);
		System.out.println("单精度浮点型数据的长度"+Float.SIZE);
		System.out.println("字符型数据的长度"+Character.SIZE);

		
		
		System.out.println("字节型整型数据的取值范围"+Byte.MIN_VALUE+"-"+Byte.MAX_VALUE);
		System.out.println("短整型整型数据的取值范围"+Short.MIN_VALUE+"-"+Short.MAX_VALUE);
		System.out.println("整型数据的取值范围"+Integer.MIN_VALUE+"-"+Integer.MAX_VALUE);
		System.out.println("长整型整型数据的取值范围"+Long.MIN_VALUE+"-"+Long.MAX_VALUE);
		System.out.println("单精度浮点型数据的取值范围"+Float.MIN_VALUE+"-"+Float.MAX_VALUE);
		System.out.println("双精度浮点型数据的取值范围"+Double.MIN_VALUE+"-"+Double.MAX_VALUE);
		System.out.println("字符型数据的取值范围"+Character.MIN_VALUE+"-"+Character.MAX_VALUE);
		System.out.println("布尔型数据的取值范围"+Boolean.FALSE+"-"+Boolean.TRUE);
	}

}
