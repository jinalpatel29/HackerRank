package com.jinal.practice.exams;
import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i=n-1; i>=0; i--){
			for(int j=0; j<n; j++){				
				if(j >=i){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}System.out.print("\n");
		}	
	}

}
