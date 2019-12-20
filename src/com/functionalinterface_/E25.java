package com.functionalinterface_;
@FunctionalInterface
interface Printable{
	void print(String str);
}

class StringUtils{
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}

public class E25 {

	public static void main(String[] args) {
		StringUtils s = new StringUtils();
		//使用lambda表达式
		printUpper("hello",str->s.printUpperCase(str));
		printUpper("world",s::printUpperCase);

	}

	private static void printUpper(String string, Printable p) {
		p.print(string);
	}

}
