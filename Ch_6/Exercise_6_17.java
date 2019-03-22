//Connor Cecil
//3-15-2019
//A program that prompts the user to enter n and displays an n-by-n matrix.

import java.util.Scanner;

	public class Exercise_6_17 {
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter n: ");
			int n = input.nextInt();
			
			printMatrix(n);		
		}
	
	public static void printMatrix(int n){
		
		int bigcount = 1;
		
		while (bigcount <= n){
			int count = 1;
							
				for(count = 1; count <= n; count++) {
					System.out.print((int)(Math.random() * 2) + " ");				
				} 			
				
			System.out.println();
			
			bigcount++;
		}  					
	}	
}