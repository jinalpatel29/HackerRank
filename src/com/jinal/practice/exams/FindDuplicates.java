package com.jinal.practice.exams;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		for(int i=0; i<10; i++){
			list.add(String.valueOf(i));
		}
		
		for(int i=0; i<5; i++){
			list.add(String.valueOf(i));
		}
		
		System.out.println("List data : "+list);
		System.out.println("Duplicates elements "+findDuplicatesinList(list));
	}

	private static Set<String> findDuplicatesinList(List<String> list) {
		Set<String> returnSet = new HashSet<>();
		Set<String> set = new HashSet<>();
		
		for (String listValue : list) {
			if(!set.add(listValue)){
				returnSet.add(listValue);
			}
		}
		
		return returnSet;
	}

}
