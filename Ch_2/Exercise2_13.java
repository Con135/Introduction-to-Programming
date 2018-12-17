import java.util.Scanner;

public class Exercise2_13{
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		double accountBalance = 0.0;
		
		// Enter annual interest rate in percentage
		System.out.print("Enter annual interest rate: ");
		double annualInterestRate = input.nextDouble();
		
		// Obtain mouthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;
		
		//Enter deposit amount per month
		System.out.print("Enter deposit amount: ");
		double depositPerMonth = input.nextDouble();
		
		accountBalance = depositPerMonth + accountBalance;
		accountBalance = accountBalance * (1 + monthlyInterestRate);
		
		accountBalance = depositPerMonth + accountBalance;
		accountBalance = accountBalance * (1 + monthlyInterestRate);
		
		accountBalance = depositPerMonth + accountBalance;
		accountBalance = accountBalance * (1 + monthlyInterestRate);
		
		accountBalance = depositPerMonth + accountBalance;
		accountBalance = accountBalance * (1 + monthlyInterestRate);
		
		accountBalance = depositPerMonth + accountBalance;
		accountBalance = accountBalance * (1 + monthlyInterestRate);
		
		accountBalance = depositPerMonth + accountBalance;
		accountBalance = accountBalance * (1 + monthlyInterestRate);		
		
		// Display results
		System.out.println("The Account value is $" + accountBalance);
		}
}