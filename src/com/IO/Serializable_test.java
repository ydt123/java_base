package com.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializable_test {

	public static void main(String[] args) throws Exception {
		Person p1=new Person(20, "Mike");
		ObjectOutputStream oout=new ObjectOutputStream(new FileOutputStream("person.txt"));
		oout.writeObject(p1);
		ObjectInputStream oin=new ObjectInputStream(new FileInputStream("person.txt"));
		Person p=(Person) oin.readObject();
		System.out.println(p);

	}

}
