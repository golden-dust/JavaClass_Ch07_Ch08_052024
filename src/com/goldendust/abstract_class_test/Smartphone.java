package com.goldendust.abstract_class_test;

public class Smartphone extends Phone {

	public Smartphone(String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("Searching the Internet...");
	}

	@Override
	public void turnOn() {
		System.out.println("Turning on the touchscreen.");
	}

	@Override
	public void turnOff() {
		System.out.println("Turning off the touchscreen.");
	}
	
	

	
}
