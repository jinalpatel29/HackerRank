package com.jinal.practice.exams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Permutation {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String permute = sc.next();
		
		List<String> perms = new ArrayList<>();
		perms = permutation("", permute);
		
		Set<String> result = new HashSet<>();
		for(int i=0; i<perms.size(); i++){
			result.add(perms.get(i));
		}
		
		System.out.println(result);
	}	

    private static List<String> permutation(String prefix, String str) {
        List<String> permutations = new ArrayList<>();
        int n = str.length();
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permutations.addAll(permutation(prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i)));
            }
        }
        return permutations;
    }


}
