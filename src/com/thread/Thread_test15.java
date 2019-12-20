package com.thread;

import java.util.ArrayList;
import java.util.List;

public class Thread_test15 {

	public static void main(String[] args) {
		//定义一个集合类，模拟存储生产的商品
		List<Object> goods=new ArrayList<>();
		//记录线程执行前统一的起始时间start
		long start=System.currentTimeMillis();
		//创建一个生产者线程，用于生产商品并存入商品集合
		Thread t1=new Thread(()->{
			int i=0;
			while(System.currentTimeMillis()-start<=30) {
				synchronized (goods) {
					//如果生产的商品大于0个，生产者就进入等待状态
					if (goods.size()>0) {
						try {
							goods.wait();
						} catch (InterruptedException e) {
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}
					} else {
						//生产者继续生产商品
						goods.add("商品"+(++i));
						System.out.println("生产商品："+i);
					}
				}
			}
		},"生产者");
		//创建一个消费者线程，用于消费商品并将商品从集合中删除
		Thread t2=new Thread(()->{
			int i=0;
			while(System.currentTimeMillis()-start<=30) {
				synchronized (goods) {
					//商品不足就唤醒生产者进行生产
					if (goods.size()<=0) {
						goods.notify();
					} else {
						//继续消费商品
						goods.remove("商品"+(++i));
						System.out.println("消费商品："+i);
					}
				}
			}
		},"消费者");
		//启动线程
		t1.start();
		t2.start();
	
	}
}
