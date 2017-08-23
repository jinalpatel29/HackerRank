package com.hackerank.algorithms.impl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Scrabble_words {

	static String[] FindWords(String slate, String[] dictionary) {
		return dictionary;


    }

	 public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        final String fileName = System.getenv("OUTPUT_PATH");
	        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	        String[] res;
	        String _slate;
	        try {
	            _slate = in.nextLine();
	        } catch (Exception e) {
	            _slate = null;
	        }
	        
	        
	        int _dictionary_size = 0;
	        _dictionary_size = Integer.parseInt(in.nextLine().trim());
	        String[] _dictionary = new String[_dictionary_size];
	        String _dictionary_item;
	        for(int _dictionary_i = 0; _dictionary_i < _dictionary_size; _dictionary_i++) {
	            try {
	                _dictionary_item = in.nextLine();
	            } catch (Exception e) {
	                _dictionary_item = null;
	            }
	            _dictionary[_dictionary_i] = _dictionary_item;
	        }
	        
	        res = FindWords(_slate, _dictionary);
	        for(int res_i=0; res_i < res.length; res_i++) {
	            bw.write(String.valueOf(res[res_i]));
	            bw.newLine();
	        }
	        
	        bw.close();
	    }
	
}
