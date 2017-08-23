package com.jinal.practice.exams;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.PriorityQueue;

public class Test {

	public static void main(String[] args){
/*		List<List<Integer>> table = new ArrayList<List<Integer>>();
		for(int i=0; i<=10; i++){
			List<Integer> row = new ArrayList<Integer>();
			for(int j=0; j<=10; j++){
				row.add(i*j);
			}
			table.add(row);
		}
		for(List<Integer> row: table){
			System.out.println(row);
		}*/
		
		
		PriorityQueue<String> pq= new PriorityQueue<String>();
		pq.add("2");
		pq.add("4");
		
		System.out.print(pq.peek()+" ");
		pq.offer("1");
		pq.add("3");
		pq.remove("1");
		System.out.print(pq.poll()+" ");
		if(pq.remove("2")){
			System.out.print(pq.poll()+" ");
		}
		System.out.print(pq.poll()+" "+pq.peek());
		
		// factory pattern
	//	Calendar c = Calendar.getInstance();
	}
}
