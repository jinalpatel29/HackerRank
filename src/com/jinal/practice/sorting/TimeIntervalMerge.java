package com.jinal.practice.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TimeIntervalMerge {
	public static ArrayList<Interval> merge(List<Interval> intervals) {
		ArrayList<Interval> result = new ArrayList<Interval>();
	 
	    if(intervals==null||intervals.size()==0)
	        return result;
	 
	    Collections.sort(intervals, new Comparator<Interval>(){
	        public int compare(Interval i1, Interval i2){
	            if(i1.start!=i2.start)
	                return i1.start-i2.start;
	            else
	                return i1.end-i2.end;
	        }
	    });
	 
	    Interval pre = intervals.get(0);
	    for(int i=0; i<intervals.size(); i++){
	        Interval curr = intervals.get(i);
	        if(curr.start>pre.end){
	            result.add(pre);
	            pre = curr;
	        }else{
	            Interval merged = new Interval(pre.start, Math.max(pre.end, curr.end));
	            pre = merged;
	        }
	    }
	    result.add(pre);
	 
	    return result;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
	    ArrayList<Interval> x = new ArrayList<Interval>();
	    Interval i1 = new Interval(1,3);
	    Interval i2 = new Interval(2,6);
	    Interval i3 = new Interval(8,10);
	    Interval i4 = new Interval(15,18);

	    x.add(i1);x.add(i2);x.add(i3);x.add(i4);

	    ArrayList<Interval> r = merge(x);

	    for(Interval i : r)
	    {
	        System.out.println(i.start+" "+i.end);
	    }

	}
}
