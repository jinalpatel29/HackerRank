package com.hackerank.algorithms.impl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Braces {

	static String[] braces(String[] values) {
		String[] results = null;
		String result;
		String exp;
		for(int i=0; i<values.length; i++){
			exp = values[i];
			Stack<Integer> stack = new Stack<>();
			for(int j=0; j<exp.length();j++){
				char ch = exp.charAt(i);
				if(ch == '(' || ch == '[' || ch == '{'){
					stack.push(i);
				}else if(ch == ')' || ch == ']' || ch == '}'){
					if(stack.isEmpty()){
						result = "NO";
						System.out.println(result);
						results[i] = result;
					}else if(stack.pop() != ch){
						System.out.println("NO");
					}
				}
			}
			if(stack.isEmpty()){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
		return results;
	}
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		//final String fileName = System.getenv("OUTPUT_PATH");
		final String fileName = System.getProperty("user.home")+"/test.txt";	
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		String[] res;

		int _values_size = 0;
		_values_size = Integer.parseInt(in.nextLine().trim());
		String[] _values = new String[_values_size];
		String _values_item;
		for(int _values_i = 0; _values_i < _values_size; _values_i++) {
			try {
				_values_item = in.nextLine();
			} catch (Exception e) {
				_values_item = null;
			}
			_values[_values_i] = _values_item;
		}

		res = braces(_values);
		for(int res_i=0; res_i < res.length; res_i++) {
			bw.write(String.valueOf(res[res_i]));
			bw.newLine();
		}

		bw.close();
	}
}



