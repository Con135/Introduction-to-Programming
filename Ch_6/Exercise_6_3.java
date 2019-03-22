//Connor Cecil
//3-8-2019
//A program that prompts the user to enter an integer and reports whether the integer is a palindrome.

import java.util.Scanner;

public class Exercise_6_3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
				
		System.out.print("Enter an integer: ");
		int i = input.nextInt();
		
		boolean result = isPalindrome(i);
		
		if (result)
			System.out.println(i + " is a palindrome");
		else 
			System.out.println(i + " is not a palindrome");

	}
	
	public static int reverse(int number) {
		String s = Integer.toString(number);
		String t = "";
		
		int c = s.length() - 1;
		do { 
			t += s.charAt(c);
			c--;
		} while(c >= 0);
		 
		int r = Integer.parseInt(t);	
		return r;
	}	
		
	public static boolean isPalindrome(int number) {
		if (number == reverse(number))
			return true;
		else 
			return false;
	}
}