package com.goldendust.type_casting.exercise;

public class MainHuman {

	public static void main(String[] args) {
		
		Company company = new Company();
		company.name = "BBB";
		company.human1 = new Worker();
		company.human2 = new Soldier();
		company.human3 = new Student();
		
		System.out.println(company.human1.getClass());
		System.out.println(company.human1.occupation);
		System.out.println(company.human2.getClass());
		System.out.println(company.human2.occupation);
		
		company.human1.namePrint();
		company.work(company.human2);
		
		Employee employee = new Employee();
		employee.setType(new Worker());
		employee.type.typePrint();
		employee.setType(new Soldier());
		employee.type.typePrint();
	}

}
