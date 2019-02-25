//Connor Cecil
//2-7-2019
//A program that prompts the user to enter an integer from 1 to 15 and displays a pyramid.

import java.util.Scanner;

class Exercise_5_17{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of lines: ");
		int lines = input.nextInt();
		
		int count = 1;
				
		while (count <= lines) {
			for (int i = 1; i <= (lines - count); i++){
			System.out.print("   ");
			}	
			for (int j = count; j >= 1; j--){
			System.out.printf("%3d", j);	
			}
			for (int k = 2; k <= count; k++){
			System.out.printf("%3d", k);
			}
			
			
			System.out.println();
			
			count++;
		}		
	}
}