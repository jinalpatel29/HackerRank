package com.hackerank.algorithms.impl;

import java.util.Scanner;

public class Grading_Students {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int a0 = 0; a0 < n; a0++){
			int grade = in.nextInt();
			// your code goes here
			grade = findGrade(grade);
		}
		in.close();
	}

	private static int findGrade(int grade) {
		int dividend = 5;
		int remainder = 0;
		if(grade >= 38){
			int multiplier = (grade/dividend)+1;
			remainder = (multiplier*5 - grade);
			if(remainder<3){
				grade = dividend*multiplier;
			}
		}
		System.out.println("grade :"+grade);
		return grade;		
	}

}
