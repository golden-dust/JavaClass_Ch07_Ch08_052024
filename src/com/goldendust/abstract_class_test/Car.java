package com.goldendust.abstract_class_test;

public abstract class Car {
	
	String model;
	String color;
	int carAge;
	
	// abstract method: 선언만하고 정의하지 않음
	// 추상 메소드는 추상 클래스에서만 선언 가능
	public abstract void drive();
	
	public void horn() {
		System.out.println("Honk honk!");
	}
	
}
