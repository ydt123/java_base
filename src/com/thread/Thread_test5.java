package com.thread;
//定义一个继承Thread线程类的子类
class TicketWindow2 implements Runnable{
	private int tickets=100;
	public void run() {
		while(true) {
			if(tickets>0) {
				System.out.println(Thread.currentThread().getName()+"正在卖第"+tickets--+"张票");
			}
		}
	}
}
public class Thread_test5 {

	public static void main(String[] args) {
		//创建TicketWindow实例对象tw
		TicketWindow2 tw=new TicketWindow2();
		//分别创建4个线程对象同时进行命名，并开启线程
		new Thread(tw, "窗口1").start();
		new Thread(tw, "窗口2").start();
		new Thread(tw, "窗口3").start();
		new Thread(tw, "窗口4").start();

	}

}
