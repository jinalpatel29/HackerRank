package com.jinal.practice.exams;

import java.text.ParseException;
import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) throws ParseException {

		Scanner in = new Scanner(System.in);
		String time = in.next();
		
		if(!time.isEmpty() && time.contains("PM")){	
			time = time.replace("PM", "");
			String[] timeArr = time.split(":");
			if(!timeArr[0].equals("12")){
				timeArr[0] = String.valueOf(Integer.parseInt(timeArr[0])+12);
			}
			time = timeArr[0]+":"+timeArr[1]+":"+timeArr[2];
		}else if(!time.isEmpty() && time.contains("AM")){
			time = time.replaceAll("AM", "");
			String[] timeArr = time.split(":");
			if(timeArr[0].equals("12")){
				timeArr[0]="00";
			}
			time = timeArr[0]+":"+timeArr[1]+":"+timeArr[2];
		}		

		System.out.println(time);
		in.close();
	}

}
