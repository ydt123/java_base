package com.thread;

class SaleThread implements Runnable {
	private int tickets = 10;
	Object lock = new Object();

	public void run() {
		while (true) {
			synchronized (lock) {
				if (tickets > 0) {
					try {
						Thread.sleep(100);// 模拟售票耗时过程
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets-- + "张票");
				}
			}

		}
	}
}

public class Thread_test11 {

	public static void main(String[] args) {
		// 创建SaleThread实例对象st
		SaleThread st = new SaleThread();
		// 分别创建4个线程对象同时进行命名，并开启线程
		new Thread(st, "窗口1").start();
		new Thread(st, "窗口2").start();
		new Thread(st, "窗口3").start();
		new Thread(st, "窗口4").start();

	}

}
