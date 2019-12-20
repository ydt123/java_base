package com.thread;
//定义一个实现Runnable接口的实现类
class MyThread2 implements Runnable {
	
	//重写Runnable接口的run()方法
	public void run() {
		int i=0;
		while(i++<15) {
			System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
		}
	}
}

public class Thread_test2 {

	public static void main(String[] args) {
		//创建Runnable接口实现类的实例对象
		MyThread2 mt1=new MyThread2();
		//使用Thread()构造方法创建线程对象
		Thread t1=new Thread(mt1, "线程1");
		//调用线程对象的start()方法启动线程
		t1.start();
		MyThread2 mt2=new MyThread2();
		Thread t2=new Thread(mt2, "线程2");
		t2.start();
		new Thread(new MyThread2(), "线程3").start();
	}

}
