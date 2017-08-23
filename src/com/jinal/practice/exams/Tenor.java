package com.jinal.practice.exams;

public class Tenor extends Singer{
	public static String sing(){
		return "la";
	}

	public static void main(String[] args){
		Tenor t = new Tenor();
		Singer s = new Singer();
		System.out.println(t.sing()+" "+s.sing());
	}
}

class Singer{
	public static String sing(){
		return "ha";
	}
}
