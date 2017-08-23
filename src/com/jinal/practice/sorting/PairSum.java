package com.jinal.practice.sorting;

public class PairSum {
	private static final int MAX =100000; 
	public static void main(String[] args) {
		int A[] = {1, 4, 3, 7, 10, -2};
        int n = 5;
        printpairs(A,  n);

	}

	private static void printpairs(int[] a, int sum) {
		
		boolean[] binmap = new boolean[10];
		for(int i=0; i<a.length; i++){
			int temp = sum - a[i];
			
			if(temp>=0 && binmap[temp]){
				System.out.println("pair with given sum "+sum +" is ("+a[i]+" , "+temp+" )");
			}
			binmap[a[i]] = true;
		}
	}

}
