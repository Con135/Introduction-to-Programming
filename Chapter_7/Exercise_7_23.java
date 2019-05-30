//Connor Cecil
//5-30-2019
//A program that finds the answer and displays all open locker numbers separated by exactly one space.

import java.util.Scanner; 

class Exercise_7_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
		boolean[] lockers = new boolean[100];
		
		int students = 1;
		
		System.out.print("The open lockers are: ");
				
		while (students < 101){
			for (int i = students - 1; i < 100; i+= students){
				
			lockers[i] = !lockers[i]; 
			}
			
			students++;
			
		}
			for (int i = 0; i < 100; i++){
				if (lockers[i] == true){
				System.out.print((i + 1) + " ");
				}
			}				
	}
}