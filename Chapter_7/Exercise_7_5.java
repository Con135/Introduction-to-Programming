//Connor Cecil
//5-24-2019
//A program that reads in ten numbers and displays the number of distinct numbers and the distinct numbers separated by exactly one space.

import java.util.Scanner;

class Exercise_7_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		
		int count = 0;
				
		System.out.print("Enter 10 numbers separated by a space: ");
		int[] numbers = new int[10];	
				
		for (int i = 0; i < 10; i++){
			numbers[i] = input.nextInt();
		}	
		int[] unique = new int[numbers.length];
		
		for (int i = 0; i < numbers.length - 1; i++){
			int currentMin = numbers[i];
			int currentMinIndex = i;
			
			for(int j = i +1; j < numbers.length; j++){
				if (currentMin > numbers[j]) {
					currentMin = numbers[j];
					currentMinIndex = j;
				}
			}
			if (currentMinIndex != i) {
				numbers[currentMinIndex] = numbers[i];
				numbers[i] = currentMin;
			}			
		}
				
		unique[count] = numbers[0];
		count++;
		for (int i = 0; i < numbers.length-1; i++){
			if (numbers[i] != numbers[i+1]){
				unique[count] = numbers[i+1];
				count++;
			}
		}
		
		System.out.println("The number of distinct numbers is " + count);	
			
		System.out.print("Array without duplicates: ");
		for (int i = 0; i < count; i++) {
			System.out.print(unique[i] + " ");	
		}							
	}
}