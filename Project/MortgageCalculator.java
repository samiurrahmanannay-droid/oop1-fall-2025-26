import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Mortgage Calculator ===");

        while (true) {
            double salary = 0;
            while (true) {
             System.out.print("Enter your monthly salary: ");
             salary = scanner.nextDouble();
            if (salary >= 10000) break;
             System.out.println(" Salary too low for mortgage eligibility. Try again.");
            }

            int creditScore = 0;
            while (true) {
            System.out.print("Enter your credit score (0 - 500): ");
            creditScore = scanner.nextInt();
            if (creditScore >= 300 && creditScore <= 500) break;
                System.out.println(" Credit score too low. Minimum required is 300. Try again.");
            }

            boolean hasCriminalRecord = true;
            while (true) {
            System.out.print("Do you have a criminal record? (true/false): ");
             hasCriminalRecord = scanner.nextBoolean();
            if (!hasCriminalRecord) break;
            System.out.println(" Applicants with criminal records are not eligible. Try again.");
            }

            System.out.println("✅ You are eligible for mortgage calculation.");

            double principal = 0;
            while (true) {
             System.out.print("Enter loan amount (Principal): ");
             principal = scanner.nextDouble();
             if (principal > 0) break;
            System.out.println("Principal must be positive. Try again.");
            }

            double annualInterestRate = 0;
            while (true) {
             System.out.print("Enter annual interest rate (e.g., 8.5 for 8.5%): ");
             annualInterestRate = scanner.nextDouble();
             if (annualInterestRate > 0) break;
  System.out.println(" Interest rate must be positive. Try again.");
            }

            int years = 0;
            while (true) {
                System.out.print("Enter loan period (in years): ");
                years = scanner.nextInt();
                if (years > 0) break;
                System.out.println("Loan period must be positive. Try again.");
            }

            double monthlyInterestRate = (annualInterestRate / 100) / 12;
            int numberOfPayments = years * 12;

 double monthlyPayment = (principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))     / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
            double totalPayment = monthlyPayment * numberOfPayments;
            double totalInterest = totalPayment - principal;
 Locale bdLocale = Locale.of("en", "BD");
        NumberFormat currency = NumberFormat.getCurrencyInstance(bdLocale);
            System.out.println("\n=== Mortgage Summary ===");
            System.out.println("Loan Amount: " + currency.format(principal));
            System.out.println("Monthly Payment: " + currency.format(monthlyPayment));
            System.out.println("Total Payment: " + currency.format(totalPayment));
            System.out.println("Total Interest: " + currency.format(totalInterest));

            scanner.close();
            }
        }

    }

