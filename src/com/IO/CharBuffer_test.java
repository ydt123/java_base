package com.IO;

import java.nio.CharBuffer;

public class CharBuffer_test {

	public static void main(String[] args) {
		CharBuffer cBuffer=CharBuffer.allocate(6);
		System.out.println("缓冲器容量是："+cBuffer.capacity());
		System.out.println("缓冲器界限值是："+cBuffer.limit());
		System.out.println("缓冲器初始位置值是："+cBuffer.position());
		cBuffer.put('a');
		cBuffer.put('b');
		cBuffer.put('c');
		System.out.println("加入元素后缓冲器界限值是："+cBuffer.limit());
		System.out.println("加入元素后缓冲器初始位置值是："+cBuffer.position());
		//反转
		cBuffer.flip();
		System.out.println("反转之后缓冲器容量是："+cBuffer.capacity());
		System.out.println("反转之后缓冲器界限值是："+cBuffer.limit());
		System.out.println("反转之后缓冲器初始位置值是："+cBuffer.position());
		System.out.println("反转之后取出的第一个元素是："+cBuffer.get());
		System.out.println("反转并取出的第一个元素之后的界限值是："+cBuffer.limit());
		System.out.println("反转并取出的第一个元素之后的初始位置值是："+cBuffer.position());
		//清除
		cBuffer.clear();
		System.out.println("清除之后缓冲器容量是："+cBuffer.capacity());
		System.out.println("清除之后缓冲器界限值是："+cBuffer.limit());
		System.out.println("清除之后缓冲器初始位置值是："+cBuffer.position());
		System.out.println("清除之后取出的第一个元素是："+cBuffer.get());
		System.out.println("清除并取出的第一个元素之后的界限值是："+cBuffer.limit());
		System.out.println("清除并取出的第一个元素之后的初始位置值是："+cBuffer.position());
		
	}

}
