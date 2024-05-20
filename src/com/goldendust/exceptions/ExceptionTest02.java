package com.goldendust.exceptions;

public class ExceptionTest02 {
	
	public static void throwTest(int a, int b) {
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		try {
			throwTest(10,0);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error: division by 0");
		}
	}

}
