package com.jinal.practice.exams;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int[] febNumber = fiboNumber(number);

		for(int i=0; i<number; i++){
			System.out.print(febNumber[i]+" ");
		}

	}

	/**
	 * @param number
	 * @return
	 */
	private static int[] fiboNumber(int number) {
		int[] febNumber = new int[number];
		febNumber[0]=0;
		febNumber[1]=1;
		for(int i=2; i<number; i++){
			febNumber[i]=febNumber[i-1]+febNumber[i-2];
		}
		return febNumber;
	}
}
