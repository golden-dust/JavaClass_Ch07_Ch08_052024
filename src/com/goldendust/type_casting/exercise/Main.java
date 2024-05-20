package com.goldendust.type_casting.exercise;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// PARENT name = new SUB();
//		Cat catAnimal = new Animal();	<- 얘는 반대라 안됨
		Cat cat = new Cat();
		Animal animal = new Animal();
		Animal animalCat = new Cat();
		/*
		부모, 자식 둘 다 가지고 있는 메소드를 쓰면 자동으로 오버라이드가 되지만
		자식 클래스에만 속해있는 메소드는 가지고는 있으나 사용할 수 없음
		*/
		
		System.out.print("cat: ");
		cat.walking();
//		cat.catWalking();
		System.out.print("animal: ");
		animal.walking();
		System.out.print("animalCat: ");
		animalCat.walking();
//		animalCat.catWalking();
		/*
		A a = new B(); 라고 하면 객체 자체는 0 ~ 3까지 가진 놈이 생성되지만,
		a변수는 0 ~ 1 까지만 가지고 있다고 알게 되고, 실제로 2, 3 index에서 메소드가 있어도 없는 거로 처리됨
		|methodA|methodB|methodC|methodD|
		 */
		System.out.println(animalCat.getClass());	// => class com.goldendust...Cat
		System.out.println(animalCat instanceof Animal);	// => true
		System.out.println(animalCat instanceof Cat);		// => true
		
//		Cat cat2 = (Cat) animal;	// 형변환 : 다운캐스팅	=> error??
		animal = cat;				// 형변환 : 업캐스팅
		
//		cat2.catWalking();
		System.out.println(animal.getClass());
		
		Dog dog = new Dog();
		Tiger tiger = new Tiger();
		Cat cat1 = new Cat();
		
		Animal animal2 = new Dog();		// 업캐스팅
		
		// 이렇게 매번 새로 만들지 않고
		Animal animal3 = new Animal();
		animal3 = new Dog();
		animal3 = new Tiger();
		animal3 = new Cat();
		// 이런식으로 만든다		(근데 이러면 자식 클래스의 메소드는 사용을 못하지 않나...?)
		System.out.println(animal3.name);
	}

}
