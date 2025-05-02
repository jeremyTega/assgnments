
// Pseudocode:
// Monthly Loan Payment Calculator
//
// collect the principal amount from the user
//
// collect the annual interest rate (in percent) from the user
//
// collect the loan duration in years from the user
//
// Convert the annual interest rate to a monthly rate:
//
// Calculate the total number of monthly payments:
//
// Use the loan amortization formula to calculate monthly payment:
//
// Display the monthly payment, formatted to 2 decimal places


 import java.util.Scanner;

 public class mortageCarculator {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);


         System.out.print("Enter principal amount: ");
         double principal = input.nextDouble();

         System.out.print("Enter annual interest rate (in %): ");
         double interestRate = input.nextDouble();

         System.out.print("Enter the duration in years: ");
         double durationYears = input.nextDouble();

         double rate = interestRate / (100 * 12);


         double numberOfPayments = durationYears * 12;

         double monthlyPayment = (principal * rate * Math.pow(1 + rate, numberOfPayments)) /
                                 (Math.pow(1 + rate, numberOfPayments) - 1);


         System.out.printf("Your monthly payment is: %.2f\n", monthlyPayment);

     }
}
