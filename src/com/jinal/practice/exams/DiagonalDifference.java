package com.jinal.practice.exams;
import java.util.Scanner;

public class DiagonalDifference {

	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int a[][] = new int[n][n];
	        
	        for(int a_i=0; a_i < n; a_i++){
	            for(int a_j=0; a_j < n; a_j++){
	                a[a_i][a_j] = in.nextInt();               
	            }            	            
	           
	        }	 
	        in.close();
	        System.out.println(diagonalDiff(a));
	    }
	  
	  private static int diagonalDiff(int[][] arr){
		  int len = arr.length;
		  int rightDiagSum = 0;
		  int leftDiagSum = 0;
		  
		  int arrIndex = 0;
		  
		  while(arrIndex < len){
			  leftDiagSum = leftDiagSum + arr[arrIndex][arrIndex];
			  rightDiagSum = rightDiagSum + arr[arrIndex][len-1-arrIndex];
			  
			  arrIndex++;
		  }
		  
		return Math.abs(leftDiagSum - rightDiagSum);
		  
	  }
}
