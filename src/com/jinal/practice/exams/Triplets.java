package com.jinal.practice.exams;
import java.util.Scanner;

public class Triplets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a0 = in.nextInt();
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int b0 = in.nextInt();
		int b1 = in.nextInt();
		int b2 = in.nextInt();

		int a = 0;
		int b = 0;

		int[] arrayA = new int[3];
		arrayA[0] = a0;
		arrayA[1] = a1;
		arrayA[2] = a2;
		int[] arrayB = new int[3];
		arrayB[0] = b0;
		arrayB[1] = b1;
		arrayB[2] = b2;  

		for(int i=0; i<arrayA.length; i++){		
			if(arrayA[i] > arrayB[i]){  
				a++;	
			}if(arrayA[i] < arrayB[i]){
				b++;
			}
		}
		System.out.println(a);
		System.out.println(b);
		in.close();
	}

}
