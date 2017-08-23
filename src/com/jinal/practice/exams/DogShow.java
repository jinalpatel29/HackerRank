package com.jinal.practice.exams;

class Dog {
	public void bark(){
		System.out.println("woof");
	}
}

class Hound extends DogShow{
	public void sniff(){
		System.out.println("sniff");
	}
	public void bark(){
		System.out.println("howl");
	}
}

public class DogShow{
	public static void main(String[] args){
		new DogShow().go();
	}
	
	void go(){
		new Hound().bark();
		((Dog) new Hound()).bark();
		((Dog) new Hound()).sniff();
	}
}
