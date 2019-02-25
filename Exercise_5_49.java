//Connor Cecil
//2-25-2019
//A program that prompts the user to enter a string and displays the number of vowels and consonants in the string.
import java.util.Scanner;

class Exercise_5_49{
	public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String s1 = input.nextLine();
				
		s1 = s1.toUpperCase();
		
		int v = 0;
		
		int c = 0;
		
		int l = s1.length() - 1;
		
		do {				
			if(s1.charAt(l) == 'A'|| s1.charAt(l) == 'E'|| s1.charAt(l) == 'I'||s1.charAt(l) == 'O'||s1.charAt(l) == 'U') {
				v++;
			}
			else {
				c++;
			}
			l--;
		} while (l >= 0);				
		    
		
		System.out.println("Vowls in string: " + v);
		
		System.out.println("Consonauts in string: " + c);                                                                         










	}
}      