package com.thread;
//线程插队：
class EmwegencyThread implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i <6; i++) {
			System.out.println(Thread.currentThread().getName()+"输入："+i);
		}
		
	}
}
public class Thread_test10 {

	public static void main(String[] args) throws Exception {
		//创建线程
		Thread t1=new Thread(new EmwegencyThread(),"线程1");
		t1.start();
		for (int i = 1; i <6; i++) {
			System.out.println(Thread.currentThread().getName()+"输入："+i);
			if(i==2) {
				//调用join()方法
				t1.join();
			}
		}

	}

}
