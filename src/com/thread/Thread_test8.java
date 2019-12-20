package com.thread;

public class Thread_test8 {

	public static void main(String[] args) {
		//lambda表达式
		Thread t1=new Thread(()->{
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName()+"正在输出i："+i);
			}
		},"优先级较低的线程");
		Thread t2=new Thread(()->{
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName()+"正在输出i："+i);
			}
		},"优先级较高的线程");
		//匿名内部类
		Thread t3=new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName()+"正在输出i："+i);
				}
			}
		},"优先级普通的线程");
		//分别设置线程的优先级
		t1.setPriority(Thread.MIN_PRIORITY);//相当于t1.setPriority(1);
		t2.setPriority(10);//相当于t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(5);//相当于t2.setPriority(Thread.NORM_PRIORITY);
		//开启线程
		t1.start();
		t2.start();
		t3.start();

	}

}
