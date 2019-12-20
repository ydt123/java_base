package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

//定义一个实现Callable接口的实现类
class MyThread3 implements Callable<Object> {
	// 重写Callable接口的call()方法
	@Override
	public Integer call() throws Exception {
		int i = 0;
		while (i++ < 15) {
			System.out.println(Thread.currentThread().getName() + "的run()方法在运行");
		}
		return i;
	}
}

public class Thread_test3 {

	public static void main(String[] args) throws Exception, ExecutionException {
		// 创建Callable接口实现类的实例对象
		MyThread3 mt1 = new MyThread3();
		// 使用FutureTask封装Callable接口的实现类对象
		FutureTask<Object> ft1 = new FutureTask<Object>(mt1);
		// 使用Thread()构造方法创建线程对象
		Thread t1 = new Thread(ft1, "线程1");
		// 调用线程对象的start()方法启动线程
		t1.start();

		MyThread3 mt2 = new MyThread3();
		FutureTask<Object> ft2 = new FutureTask<Object>(mt2);
		Thread t2 = new Thread(ft2, "线程2");
		t2.start();
		new Thread(new FutureTask<Object>(new MyThread3()), "线程3").start();
		// 通过FutureTask对象的方法管理返回值
		System.out.println("线程1的返回结果：" + ft1.get());
		System.out.println("线程2的返回结果：" + ft2.get());

	}

}
