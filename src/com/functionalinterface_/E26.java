package com.functionalinterface_;

@FunctionalInterface
interface PersonBuilder{
	Person buildPerson(String name);
}
class Person{
	private String name;
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
public class E26 {
	
	public static void main(String[] args) {
		PrinterName("王一博",new PersonBuilder() {
			@Override
			public Person buildPerson(String name) {
				return new Person(name);
			}
		});
		PrinterName("  ♥ ",name->new Person(name));
		PrinterName("肖  战",Person::new);
	}

	private static void PrinterName(String string, PersonBuilder pb) {
		System.out.println(pb.buildPerson(string).getName());
		
	}

	
}
