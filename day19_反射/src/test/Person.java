package test;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void say() {
		System.out.println("hello, world");
	}
	
	public void say(String name) {
		System.out.println("hello, " + name);
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
	Person(){

	}

}
