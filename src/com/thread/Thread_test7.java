package com.thread;

class DaemonThread implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName() + "---在运行");
		}

	}

}

public class Thread_test7 {

	public static void main(String[] args) {
		// 判断是否为后台线程
		System.out.println("main线程是后台线程吗？" + Thread.currentThread().isDaemon());
		DaemonThread dt = new DaemonThread();
		Thread t1 = new Thread(dt, "后台线程");
		System.out.println("t1线程是默认后台线程吗？" + t1.isDaemon());
		// 将线程t1线程对象设置为后台线程
		t1.setDaemon(true);
		t1.start();
		// 模拟主线程main的执行任务
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

	}

}
