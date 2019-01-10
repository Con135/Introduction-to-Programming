//Connor Cecil
//1-4-2018
//A program that finds the number of days in a month.

import java.util.Scanner;

class Exercise_4_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		System.out.print("Enter a month: ");
		String month = input.next();	
		
		if (month.equals("Jan")){
			System.out.print("Jan " + year + " has 31 days.");
		}
		else if (month.equals("Feb")){
			if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
			System.out.print("Feb " + year + " has 29 days.");
			}
			else {
			System.out.print("Feb " + year + " has 28 days.");
			}
		}
		else if (month.equals("Mar")){
			System.out.print("Mar " + year + " has 31 days.");
		}	
		else if (month.equals("Apr")){
			System.out.print("Apr " + year + " has 30 days.");
		}	
		else if (month.equals("May")){
			System.out.print("May " + year + " has 31 days.");
		}	
		else if (month.equals("Jun")){
			System.out.print("Jun " + year + " has 30 days.");
		}	
		else if (month.equals("Jul")){
			System.out.print("Jul " + year + " has 31 days.");
		}	
		else if (month.equals("Aug")){
			System.out.print("Aug " + year + " has 31 days.");
		}	
		else if (month.equals("Sep")){
			System.out.print("Sep " + year + " has 30 days.");
		}
		else if (month.equals("Oct")){
			System.out.print("Oct " + year + " has 31 days.");
		}
		else if (month.equals("Nov")){
			System.out.print("Nov " + year + " has 30 days.");
		}	
		else if (month.equals("Dec")){
			System.out.print("Dec " + year + " has 31 days.");
		}	
	}
}