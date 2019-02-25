//Connor Cecil
//1-28-2019
//A program that finds numbers disvible by 5 or 6, but not both, from 100 to 200.

import java.util.Scanner;

public class Exercise_5_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number = 100;
		
		int count = 0;
				
		while (number < 201) {
			if (number % 5 == 0 ^ number % 6 == 0) {
				System.out.print(number + " ");
				count = (count + 1);
				
				if (count % 10 == 0 && count != 0){
					System.out.println();
				}
			}
				
			number = (number + 1);
			
		}
		
				
	} 
}