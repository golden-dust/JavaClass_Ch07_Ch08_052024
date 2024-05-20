package com.goldendust.exceptions;

public class ExceptionTest01 {

	public static void main(String[] args) {
		
		try {
			int a = 10;
			int div = a / 0;
			System.out.println(div);
		} catch (Exception e) {
			System.out.println("division by zero!");
			e.printStackTrace();
		} finally {
			System.out.println("FINALLY");
		}
		
	}
	
}
