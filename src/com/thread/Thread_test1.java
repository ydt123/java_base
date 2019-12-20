package com.thread;
//定义一个继承Thread线程类的子类
class MyThread1 extends Thread{
	//创建子线程类有参构造方法
	public MyThread1(String name) {
		super(name);
	}
	//重写Thread类的run()方法
	public void run() {
		int i=0;
		while(i++<15) {
			System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
		}
	}
}

public class Thread_test1 {

	public static void main(String[] args) {
		//创建MyThread实例对象
		MyThread1 t1=new MyThread1("线程1");
		//调用start()方法启动线程
		t1.start();
		MyThread1 t2=new MyThread1("线程2");
		t2.start();
		new MyThread1("线程3").start();
	}

}
