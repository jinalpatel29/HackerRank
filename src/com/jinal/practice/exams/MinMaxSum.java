package com.jinal.practice.exams;
import java.util.Scanner;

public class MinMaxSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		long c = in.nextLong();
		long d = in.nextLong();
		long e = in.nextLong();

		long minSum = 1;
		long maxSum = 0;
		long[] num ={a,b,c,d,e};
		for(int i=0; i<num.length; i++){
			long sum = 0L;
			for(int j=0; j<num.length; j++){										
				if(i!=j){
					sum = sum + num[j];							
				}

			}
			if(i==0){
				minSum = sum;
				maxSum = sum;
			}
			else{
				if(sum > maxSum){
					maxSum = sum;
				}if(sum < minSum){
					minSum = sum;
				}
			}
		//	System.out.println(sum);
		}	
		System.out.println(maxSum);
		System.out.println(minSum);
	


		in.close();
	}

}
