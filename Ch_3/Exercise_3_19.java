//Connor Cecil
//1-2-2018
//Solves for the perimeter of a triangle.

import java.util.Scanner;

class Exercise_3_19{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
				System.out.print("Enter a value for Edge A: ");
				double valueA = input.nextDouble();
				
				System.out.print("Enter a value for Edge B: ");
				double valueB = input.nextDouble();
				
				System.out.print("Enter a value for Edge C: ");
				double valueC = input.nextDouble();
				
				if ((valueA + valueB <= valueC) || (valueA + valueC <= valueB) || (valueB + valueC <= valueA)){
				System.out.println("The input is invalid.");	
				}
				else {
				System.out.println("The perimeter is " + (valueA + valueB + valueC));
				}				
				}
}
