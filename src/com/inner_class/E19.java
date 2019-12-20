package com.inner_class;
//定义外部类
class Outer {
	static int m=0;//定义外部类静态变量m
	void test1() {
		System.out.println("外部类成员方法test1");
	}
	void test2() {
		//定义局部内部类Inner，在局部内部类中访问外部类变量和方法
		class Inner{
			int n=1;
			void show() {
				System.out.println("外部类变量m="+m);
				test1();
			}
		}
		//在创建局部内部类的方法中，调用局部内部类变量和方法
		Inner inner=new Inner();
		System.out.println("局部内部变量n="+inner.n);
		inner.show();
	}
	static class Inner{
		//静态内部类访问外部类静态成员
		void show() {
			System.out.println("外部类静态变量m="+m);
		}
	}
}

//定义测试类
public class E19 {

	public static void main(String[] args) {
		Outer outer=new Outer();
		outer.test2();//通过外部类对象调用创建了局部内部类的方法
		//静态内部类可以直接通过外部类创建
		Outer.Inner inner=new Outer.Inner();
		inner.show();
	}

}
