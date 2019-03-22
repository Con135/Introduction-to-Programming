//Connor Cecil
//3-22-2019
//A test program that prompts the user to enter a number and its width and displays a string returned by invoking format(number, width).

import java.util.Scanner;

	public class Exercise_6_37 {
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter number: ");
			int number = input.nextInt();
			
			System.out.print("Enter width: ");
			int width = input.nextInt();
			
			String output = format(number, width);
			System.out.print(output);
			
		}
			
		public static String format(int number, int width){
			String t = number + "";
			int n = t.length();
			
			int w = width;
			
			int count = 0;
		
			int z = w - n;
			
			
			while(count < z){
				t = "0" + t;
				count++;
			}
					
			return(t);
	}															
}
