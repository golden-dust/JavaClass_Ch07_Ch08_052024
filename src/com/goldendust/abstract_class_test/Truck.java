package com.goldendust.abstract_class_test;

public class Truck extends Car {
	
	// 추상 메소드 꼭 구현해주기
	@Override
	public void drive() {
		System.out.println("Brrrrum");
	}
	
	

}
