package com.goldendust.interface_exercise;

public class Main {

	public static void main(String[] args) {
		
//		Car car = new Car();	// 인터페이스는 new 연산자로 객체 생성 불가
		
		Truck truck = new Truck();
		
		Car car;		// 인터페이스 객체 선언
		
		car = truck;	// 업캐스팅 가능
	}

}
