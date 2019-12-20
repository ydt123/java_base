package com.集合;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_test {

	public static void main(String[] args) {
		//Collections：类    Collection：接口
		ArrayList<String> list =new ArrayList<>();
		Collections.addAll(list, "晏","付","方","顾");
		System.out.println("排序前："+list);
		//反转：reverse
		Collections.reverse(list);
		System.out.println("反转后："+list);
		//自然顺序排列:sort
		Collections.sort(list);
		System.out.println("自然顺序排列后："+list);
		//随机
		Collections.shuffle(list);
		System.out.println("随机排序后："+list);
		//交换
		Collections.swap(list, 0, list.size()-1);;
		System.out.println("首尾交换后："+list);
									

	}

}
