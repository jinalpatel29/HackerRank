package com.hackerank.algorithms.impl;

import java.util.Scanner;

public class AppleAndOrange {
  /*The first line contains two space-separated integers denoting the respective values of  and . 
	The second line contains two space-separated integers denoting the respective values of  and . 
	The third line contains two space-separated integers denoting the respective values of  and . 
	The fourth line contains  space-separated integers denoting the respective distances that each apple falls from point . 
	The fifth line contains  space-separated integers denoting the respective distances that each orange falls from point .
	*/

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int s = in.nextInt(); // distance to 
        int t = in.nextInt(); // distance from
        int a = in.nextInt(); // apple tree location
        int b = in.nextInt(); // orange tree location
        int m = in.nextInt(); // no of apples
        int n = in.nextInt(); // no of oranges
        
        int loc = 0;
        int appCnt = 0;
        int oraCnt = 0;
        
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            loc = a+apple[apple_i];
            if(loc>=s && loc<=t ){
            	appCnt++;
            }          
        }
        
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();            
            loc = b+orange[orange_i];
            if(loc>=s && loc<=t ){
            	oraCnt++;
            } 
        }
        System.out.println(appCnt);
        System.out.println(oraCnt);
        
        
        in.close();
    }

	

}
