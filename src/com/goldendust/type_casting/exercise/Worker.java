package com.goldendust.type_casting.exercise;

public class Worker extends Human {
	
	public Worker() {
		super();
		this.occupation = "worker";
	}
	
	public void typePrint() {
		System.out.println("I am a worker.");
	}

}
