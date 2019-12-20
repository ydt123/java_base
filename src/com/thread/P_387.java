package com.thread;
//定义一个继承Thread线程类的子类
class TicketWindow3 implements Runnable{
	private int tickets=80;
	public void run() {
		while(true) {
			if(tickets>0) {
				System.out.println(Thread.currentThread().getName()+"正在分发第"+tickets--+"份学习笔记");
			}
		}
	}
}
public class P_387 {

	public static void main(String[] args) {
		//创建TicketWindow实例对象tw
		TicketWindow3 tw=new TicketWindow3();
		//分别创建3个线程对象同时进行命名，并开启线程
		new Thread(tw, "老师a").start();
		new Thread(tw, "老师b").start();
		new Thread(tw, "老师c").start();

	}

}
