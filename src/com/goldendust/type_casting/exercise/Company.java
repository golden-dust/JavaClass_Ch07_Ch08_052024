package com.goldendust.type_casting.exercise;

public class Company {
	String name;
	int age;
	
	Human human1 = new Human();
	Human human2 = new Human();
	Human human3 = new Human();
	
	public void work(Human human) {
		System.out.println(human.name + " is working...");
	}
	
}
