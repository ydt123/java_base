package com.集合;

import java.util.ArrayList;
import java.util.Iterator;

public class Diedai_xiugai {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("s1");
		list.add("s2");
		list.add("s3");
		list.add("s4");
		System.out.println(list);
		//等号右边通过list对象调用迭代方法
		//等号左边声明等号右边返回的迭代对象
		Iterator<String> diedai=list.iterator();
		//hasNext()是一个判断，通过迭代对象判断有下一个元素吗？
		while (diedai.hasNext()) {
			//取出Arraylist集合里的元素，mgys:每个元素
			Object mgys = (Object) diedai.next();
			if (mgys.equals("s2")) {
				diedai.remove();
				//break;
			}
		}
		System.out.println(list);

	}

}
