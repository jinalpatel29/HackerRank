package com.jinal.practice.exams;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int[] arr = new int[n];
		int positiveInt = 0;
		int negativeInt = 0;
		int zeroInt = 0;
		
		for(int i=0; i<n; i++){
			arr[i]=in.nextInt();

			if(arr[i]<0){
				negativeInt++;
			}else if(arr[i]>0){
				positiveInt++;
			}else{
				zeroInt++;
			}
		}
		in.close();
		double posFracValue = (double)positiveInt/n ;
		double negFracValue = (double)negativeInt/n ;
		double zerFracValue = (double)zeroInt/n ;

		DecimalFormat numberFormat = new DecimalFormat("0.000000");
		System.out.println(numberFormat.format(posFracValue));
		System.out.println(numberFormat.format(negFracValue));
		System.out.println(numberFormat.format(zerFracValue));

	}

}
