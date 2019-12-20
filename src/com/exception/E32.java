package com.exception;
//自定义异常类BlcException继承Exception类
class BlcException extends Exception{

	public BlcException() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public BlcException(String message) {
		super(message);
		// TODO 自动生成的构造函数存根
	}
	
}
public class E32 {
	//声明方法时，可以在最后声明抛出异常，用throws关键字
	private static int divide(int x, int y)throws BlcException  {
		//在方法体内部，使用throw关键字抛出异常
		if(y==0) {
			throw new BlcException("除数是0");
		}
		int result=x/y;
		return result;
	}

	public static void main(String[] args) {
		int result;
		try {
			result=divide(4,0);//0不能作除数，会报错
			System.out.println(result);
		}catch (Exception e) {
			System.out.println("捕获的异常信息为："+e.getMessage());
		}

	}

}
