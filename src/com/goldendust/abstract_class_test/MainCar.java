package com.goldendust.abstract_class_test;

public class MainCar {

	public static void main(String[] args) {
		
//		Car car = new Car();
		// 추상 클래스는 객체를 생성할 수 없음
		Truck truck = new Truck();
		truck.drive();
		
	}

}
