//Connor Cecil
//1-4-2018
//A program that finds the area of pentagons.

import java.util.Scanner;

class Exercise_4_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length from the center to the vertex: ");
		double length = input.nextDouble();
		
		double side = ((2 * length) * Math.sin(Math.PI / 5));		
		
		double area = ((5 * (side * side)) / (4 * Math.tan(Math.PI / 5)));
		
		System.out.printf("The area of the pentagon is %4.2f.", (area));		
		}
}