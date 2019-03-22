//Connor Cecil
//3-18-2019
//A method that converts milliseconds to hours, minutes, and seconds.

import java.util.Scanner;

	public class Exercise_6_25 {
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter amount of milliseconds: ");
			int millis = input.nextInt();
			
			String output = convertMillis(millis);
			
			System.out.print(output);
			
		}
			
		public static String convertMillis(long millis){
			
			int hour = 0;
			
			int min = 0;
			
			int sec = 0;
			
			while (millis >= 3600000){
				millis -= 3600000; 
				hour++;
			}
			
			while (millis >= 60000){
				millis -= 60000;
				min++;
			}
			
			while (millis >= 1000){
				millis -= 1000;
				sec++;
			}	
				
			return(hour + ":" + min + ":" + sec);
						
	}
}