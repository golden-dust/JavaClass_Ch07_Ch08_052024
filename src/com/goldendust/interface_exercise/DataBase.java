package com.goldendust.interface_exercise;

public class DataBase implements DataAccessObject {

	String name;
	
	@Override
	public void select() {
		System.out.println(this.name + "에서 검색");
	}

	@Override
	public void insert() {
		System.out.println(this.name + "에 삽입");		
	}

	@Override
	public void update() {
		System.out.println(this.name + "를 수정");		
	}

	@Override
	public void delete() {
		System.out.println(this.name + "에서 삭제");		
	}

	
}
