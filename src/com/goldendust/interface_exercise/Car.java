package com.goldendust.interface_exercise;

public interface Car {
	
	// 인터페이스 내에서는 상수만 선언 가능
	String modelName = "Hyundai";
	
	// 인터페이스 내의 모든 메소드 = 추상메소드
	public void driveForward();
	public void driveBackward();
	public void stopDriving();
	public void horn();
	

}
