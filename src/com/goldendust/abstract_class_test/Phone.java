package com.goldendust.abstract_class_test;

public abstract class Phone {
	
	public String owner;
	
	public Phone(String owner) {
		super();
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("Turning the phone on.");
	}
	
	public void turnOff() {
		System.out.println("Turning the phone off.");
	}

}
