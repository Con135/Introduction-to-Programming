//Connor Cecil
//5-24-2019
//A program that prompts the user to enter ten numbers, invokes this method to return the minimum value, and displays the minimum value.

import java.util.Scanner;

class Exercise_7_9 {
	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);	
		
		System.out.print("Enter 10 numbers separated by a space: ");
		double[] numbers = new double[10];	
		
		for (int i = 0; i < 10; i++){
			numbers[i] = input.nextDouble();
		}	
		
		System.out.println("The minimum number is: " + min(numbers));
		
	}
	
	public static double min(double[] numbers) {
											
		double min = numbers[0];
		for (int i = 1; i < numbers.length; i++){
			if (numbers[i] < min) 
			min = numbers[i];
		}
				
		return min;				
	}
}