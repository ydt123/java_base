package com.集合;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Test test=new Test();
		
		ArrayList<Object> arrayList=new ArrayList<>();
		long start1=System.currentTimeMillis();
		test.listTest(arrayList);
		long end1=System.currentTimeMillis();
		System.out.println("用ArrayList插入15万个元素花费"+(end1-start1)+"毫秒");
		
		LinkedList<Object> linkedList=new LinkedList<>();
		long start2=System.currentTimeMillis();
		test.listTest(linkedList);
		long end2=System.currentTimeMillis();
		System.out.println("用LinkedList插入15万个元素花费"+(end2-start2)+"毫秒");
		
		
		long start3=System.currentTimeMillis();
		test.listRead(arrayList);
		long end3=System.currentTimeMillis();
		System.out.println("用ArrayList倒序读取15万个元素花费"+(end3-start3)+"毫秒");
		
		
		long start4=System.currentTimeMillis();
		test.listRead(linkedList);
		long end4=System.currentTimeMillis();
		System.out.println("用LinkedList倒序读取15万个元素花费"+(end4-start4)+"毫秒");

	}

}
class Test{
	public void listTest(List list) {
		Random random=new Random();
		for (int i = 0; i < 150000; i++) {
			list.add(0,i);
		}
		
		
	}
	public void listRead(List list) {
		//Random random=new Random();
		for (int i = 150000-1; i >=0 ; i--) {
			list.get(i);
		}
	}
}
