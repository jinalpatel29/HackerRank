package com.jinal.practice.exams;

import java.util.Scanner;

public class Exceptions2 {

	public static void main(String []args) {
        // Write your code here.  
        Scanner in = new Scanner(System.in);       
        int a[] = new int[3];
        int b[] = new int[3];
       // int n = in.nextInt();
      //  int p = in.nextInt();
        MyCalculator cal = new MyCalculator();
       
        for(int i=0; i<a.length; i++){
        	a[i] = in.nextInt();
        	for(int j =0; j<b.length; j++){
        		
        		b[j]= in.nextInt();
        	}
        }
      /*  for(int j=0; j<b.length; j++){
        	b[j] = in.nextInt();
        }*/
               
        try{
        	for(int i=0; i<a.length; i++){
        		for(int j=0; j<b.length; j++){
        			if(a[i] > 0 || b[i] > 0){
        				System.out.print(cal.power(a[i],b[j]));
        			}
        		}

          }
        }catch(Exception e){
            System.out.println("negative number");
        }
    }

}


