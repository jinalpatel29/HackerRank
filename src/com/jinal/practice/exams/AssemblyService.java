package com.jinal.practice.exams;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/*	The customer would like to display the items of a subassembly from the top-level component (a
helmet, for example) and an individual item that composes that component (a screw). A service
returns the links between individual parts as an unordered list of ID pairs as below.

[[1001, 54], [150, 88], [54, 42], [39, 1001], [42, 150]]

The reconstructed list of items in order would be as follows:

[39, 1001, 54, 42, 150, 88]

Provide an implementation for a function that performs this operation.*/

public class AssemblyService {
	private static int[][] componentIds = {{1001, 54}, {150, 88}, {54, 42}, {39, 1001}, {42, 150}};
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter startId : ");
		int startId = in.nextInt();
		
		List<Integer> result = findOrderedSubassembly(componentIds, startId);
		System.out.println("result: "+result);
		in.close();
	}
	
	public static List<Integer> findOrderedSubassembly(int[][] componentIds, int startId){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		// Adding two dimensional int array rows elements into map 
		for (int[] row : componentIds) {
			for (int element : row) {
				map.put(row[0], element);
			}
		}
		System.out.println("map values= " + map);
		List<Integer> results = new ArrayList<Integer>();
		// lookup map values start with startId "39" which gives 1001, 
		// 1001 will become new startId to lookup next value then add 1001 into list 
		// continue until map contains Key
		while(map.containsKey(startId)){
			results.add(startId); //adding startId into result list first value is 39 passed from function call
			startId=map.get(startId); // Returns the value to which the specified key is mapped for first time 
		}
		results.add(startId);  // to add last element into result list		

		return results;  
	}

}
