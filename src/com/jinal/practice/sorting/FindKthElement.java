package com.jinal.practice.sorting;

import java.util.Scanner;

/*
 * K’th Smallest/Largest Element in Unsorted Array | Set 1
 * 	Given an array and a number k where k is smaller than size of array, 
 *  we need to find the k’th smallest element in the given array. 
 *  It is given that ll array elements are distinct.

	Examples:
	Input: arr[] = {7, 10, 4, 3, 20, 15}
	       k = 3
	Output: 7
	
	Input: arr[] = {7, 10, 4, 3, 20, 15}
	       k = 4
	Output: 10
 */
public class FindKthElement {

	public static void main(String[] args) {
		int[] arr = {7, 10, 4, 3, 20, 15};
		System.out.print("Please enter number");
		Scanner sc = new Scanner(System.in);		
		int k = sc.nextInt();
		int size = arr.length;
		int result = findKthElement(arr, size, k);
		System.out.println("Output : "+result);

	}

	private static int findKthElement(int[] arr, int size, int k) {
		if(k>=size){
			return 0;
		}else if(k < size){
			for(int i=1; i<arr.length; i++){
				if(arr[i] > arr[k] ){
					int temp = arr[i];//7
					arr[i]=arr[k];//4
					k--;
				}
			}
		}
		return 0;
	}

}
