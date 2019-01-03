//Connor Cecil
//1-3-2018
//A program that checks if a point is inside the rectangle.

import java.util.Scanner;

class Exercise_3_23{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a X point: ");
		double xPoint = input.nextDouble();
		
		System.out.print("Enter a Y point: ");
		double yPoint = input.nextDouble();
		
		if ((xPoint >= -5) && (xPoint <= 5) && (yPoint >= -2.5) && (yPoint <= 2.5)){
		System.out.print("Point (" + xPoint + ", " + yPoint + ") is in the rectangle.");
		}
		else {
		System.out.print("Point (" + xPoint + ", " + yPoint + ") is not in the rectangle.");		
		}		
	}
}