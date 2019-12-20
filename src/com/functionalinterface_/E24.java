package com.functionalinterface_;
@FunctionalInterface
//抽象方法
interface Calcable{
	int calc(int num);
}
class Math{
	//定义一个静态的求绝对值的方法
	public static int abs(int num) {
		if(num<0) {
			return -num;
		}else {
			return num;
		}
	}
}
public class E24 {

	public static void main(String[] args) {
		//使用lambda表达式，是一种简化写法，将最关键的语句写在第三部分
		printAbs(-10,n->Math.abs(n));
		//使用方法引用的方式： 类名::静态方法名  来替换lambda表达式
		printAbs(-50,Math::abs);
		printAbs(-25,new Calcable(){
			@Override
			public  int calc(int num) {
				if(num<0) {
					return -num;
				}else {
					return num;
				}
			}
		});
	}

	private static void printAbs(int i, Calcable c) {
		//calc方法在这里是用求绝对值来实现的
		System.out.println(c.calc(i));
	}

}
