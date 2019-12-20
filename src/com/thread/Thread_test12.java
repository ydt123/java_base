package com.thread;
class SaleThread2 implements Runnable{
	private int tickets=10;
	public void run() {
		while(true) {
			saleTicket();
		}
	}
	private synchronized void saleTicket() {
		if(tickets>0) {
			try {
				Thread.sleep(100);//模拟售票耗时过程
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"正在卖第"+tickets--+"张票");
		}
		
	}
}
public class Thread_test12 {

	public static void main(String[] args) {
		//创建TicketWindow实例对象tw
		SaleThread2 tw=new SaleThread2();
		//分别创建4个线程对象同时进行命名，并开启线程
		new Thread(tw, "窗口1").start();
		new Thread(tw, "窗口2").start();
		new Thread(tw, "窗口3").start();
		new Thread(tw, "窗口4").start();

	}

}
