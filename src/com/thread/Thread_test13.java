package com.thread;

//同步锁：
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SaleThread3 implements Runnable {
	private int tickets = 10;
	private final Lock lock = new ReentrantLock();

	public void run() {
		while (true) {
			lock.lock();
			if (tickets > 0) {
				try {
					Thread.sleep(10);// 模拟售票耗时过程
					System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets-- + "张票");
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				} finally {
					lock.unlock();
				}

			}
		}
	}
}

public class Thread_test13 {

	public static void main(String[] args) {
		// 创建SaleThread实例对象st
		SaleThread3 st = new SaleThread3();
		// 分别创建4个线程对象同时进行命名，并开启线程
		new Thread(st, "窗口1").start();
		new Thread(st, "窗口2").start();
		new Thread(st, "窗口3").start();
		new Thread(st, "窗口4").start();

	}

}
