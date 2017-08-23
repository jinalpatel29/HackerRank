package jinal.practice.palindrome;
import java.util.Scanner;

public class BitsPalindrome {
	
	public static boolean isPalindrome(int number) {    
        String s = Integer.toBinaryString(number);
        StringBuffer sb = new StringBuffer(s);
        System.out.println("number1:  "+s);
        StringBuffer sb2 = new StringBuffer(sb).reverse();
        System.out.println("number2:  "+sb2);

        if (String.valueOf(sb).compareTo(String.valueOf(sb2)) == 0){
            return true;
        }
        return false;
    }
	
	public static void main(String[] args) {		
		Scanner in = new Scanner(System.in);
		System.out.print("Please Enter a number : ");
		int palindrome = in.nextInt();
		if(isPalindrome(palindrome)){
			System.out.println("Number : " + palindrome + " is a palindrome");
		}else{
			System.out.println("Number : " + palindrome + " is not a palindrome");
		}	
		in.close();
	}

}
