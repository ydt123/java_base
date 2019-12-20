package com.string;
//获取时间戳：当前时间与1970年1月1日0点0分0秒之间的时间差，单位是毫秒
public class String_currentTimeMillis {

	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		long sum=0;
		for (long i = 0; i < 10000000000l; i++) {
			sum+=i;
		}
		long endTime=System.currentTimeMillis();
		System.out.println("从1加到1百亿耗时："+(endTime-startTime)+"毫秒");
	}

}
