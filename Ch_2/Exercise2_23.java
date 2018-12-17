import java.util.Scanner;

public class Exercise2_23{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter driving distance: ");
		double drivingDistance = input.nextDouble();
		
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();
		
		double costOfDriving = 0.0;
		
		costOfDriving = (drivingDistance / milesPerGallon) * pricePerGallon;
				
		System.out.print("The cost of driving is " + costOfDriving);
	}

}