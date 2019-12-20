package com.thread;
class DeadLockThread implements Runnable{
	//定义两个不同的锁对象
	static Object chopsticks=new Object();
	static Object knifeAndFork=new Object();
	private boolean flag;
	DeadLockThread(boolean flag) {
		this.flag=flag;
	}
	@Override
	public void run() {
		if(flag) {
			while(true) {
				//锁对象上的同步代码块
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName()+"---if---chopsticks");
					synchronized (knifeAndFork) {
						System.out.println(Thread.currentThread().getName()+"---if---knifeAndFork");
					}
				}
			}
		}else {
			while(true) {
				synchronized (knifeAndFork) {
					System.out.println(Thread.currentThread().getName()+"---else---knifeAndFork");
					synchronized (chopsticks) {
						System.out.println(Thread.currentThread().getName()+"---else---chopsticks");
					}
				}
			}
		}
		
	}
	
}
public class Thread_test14 {

	public static void main(String[] args) {
		DeadLockThread t1=new DeadLockThread(true);
		DeadLockThread t2=new DeadLockThread(false);
		new Thread(t1,"Chinese").start();
		new Thread(t2,"American").start();

	}

}
