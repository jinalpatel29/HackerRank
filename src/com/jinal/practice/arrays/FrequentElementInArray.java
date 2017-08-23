package com.jinal.practice.arrays;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 *  Write a java program or function to find the most frequent element in array.
	Your program should take an array of integers as input and find out the most frequently occurring element in that array.
 **/

public class FrequentElementInArray {

	public static void main(String[] args) {
		//	Scanner in = new Scanner(System.in);
		System.out.println("Please enter elements of Array");
		int[] array = {1, 2, 3 ,5,6,3,2,3,2};
		getMostFrequentElement(array);
	}

	private static void getMostFrequentElement(int[] array) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for(int i : array){
			if(map.containsKey(i)){
				// If an element is present, incrementing its count by 1
				map.put(i, map.get(i)+1);
			}else{
				// If an element is not present, put that element with 1 as its value 
				map.put(i, 1);
			}	
		}
		int element =0;
		int frequency =1;
		// Iterating through map to get the most frequent element and its frequency
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for(Entry<Integer, Integer> entry : entrySet){
			if(entry.getValue() > frequency){
				element = entry.getKey();
				frequency = entry.getValue();
			}
		}
		

		// Printing the most frequent element in array and its frequency
		if(frequency > 1){
			System.out.println("Input array : "+Arrays.toString(array));
			System.out.println("Most frequent element is :" + element);
			System.out.println("Its frequency is :" + frequency);
		}else{
			System.out.println("Input array : "+Arrays.toString(array));
			System.out.println("No Frequent element. All elements are unique");
			System.out.println("========================================");
		}
	}

}
