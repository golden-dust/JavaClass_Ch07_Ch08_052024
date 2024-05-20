package com.goldendust.abstract_class_test;

public class MainPhone {

	public static void main(String[] args) {
		
//		Phone phone = new Phone(); 	// 추상클래스는 객체 선언 불가
		Smartphone smartphone = new Smartphone("Mark Lee");
		
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();

	}

}
