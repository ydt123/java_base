package com.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Thread_test17 {

	public static void main(String[] args) throws Exception, ExecutionException {
		//1.创建第一个线程，执行1到10相加运算
		CompletableFuture<Integer> cf1=CompletableFuture.supplyAsync(()->{
			int sum=0,i=0;
			while(i++<10) {
				sum+=i;
				System.out.println(Thread.currentThread().getName()+"线程任务正在执行...i:"+i);
			}
			return sum;
		});
		//2.创建第一个线程，执行11到20相加运算
				CompletableFuture<Integer> cf2=CompletableFuture.supplyAsync(()->{
					int sum=0,i=10;
					while(i++<20) {
						sum+=i;
						System.out.println(Thread.currentThread().getName()+"线程任务正在执行...i:"+i);
					}
					return sum;
				});
		//将两个线程执行结果进行整合
		int total=cf1.get()+cf2.get();
		System.out.println("1~20相加的结果为："+total);

	}
	
}
