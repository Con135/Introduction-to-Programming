import java.util.Scanner;

public class Exercise2_1{
	public static void main(String[] args) {
		System input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Celsius");
		double celsius = input.nextDouble();
		
		// Convert Celsius to Fahrenheit
		double fahrenheit = (9.0 / 5.0) * (celsius + 32.0);
		System.out.println("Celsius " + celsius + " is " + fahrenheit + " in Fahrenheit");
	}
}