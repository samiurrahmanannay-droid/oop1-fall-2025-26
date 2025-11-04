
import java.util.Scanner;

import java.text.NumberFormat;
import java.util.Locale;
public class MortgageCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.getDefault());
        System.out.println("=== Mortgage Calculator ===");
        System.out.print("Enter loan amount (Principal): ");
        double principal = input.nextDouble();
        System.out.print("Enter annual interest rate (e.g., 8.5 for 8.5%): ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter loan period (in years): ");
        int years = input.nextInt();
        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        int numberOfPayments = years * 12;
        double monthlyPayment = (principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
         / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        double totalPayment = monthlyPayment * numberOfPayments;
        double totalInterest = totalPayment - principal;
        System.out.println("\n=== Mortgage Summary ===");
        System.out.println("Loan Amount: " + currency.format(principal));
        System.out.println("Monthly Payment: " + currency.format(monthlyPayment));
        System.out.println("Total Payment: " + currency.format(totalPayment));
        System.out.println("Total Interest: " + currency.format(totalInterest));
        input.close();

    }

}
 
 
 