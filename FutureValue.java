/*
Problem 3: Future Value

Suppose money is deposited into a savings account that earns monthly compound interest. The account’s future value can be calculated using this formula:

F = P × (1 + i)ᵗ

Where:

F is the account’s future value.
P is its present value.
i is the monthly interest rate expressed as a decimal.
t is the number of months.

Write a Java method named:

futureValue

The method must:

Accept the present value, monthly interest rate, and number of months as parameters.
Calculate the account’s future value.
Return the future value as a double.

In the main method, ask the user to enter:

The account’s present value.
The monthly interest rate as a decimal.
The number of months the money will remain in the account.

For example, enter a monthly interest rate of 0.5% as:

0.005

Call the futureValue method and display the returned value. Format all monetary values to two decimal places.

Required Filename
FutureValue.java
*/
import java.util.Scanner;

public class FutureValue {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Ask the user to enter the account's present value
        System.out.println("Please enter the account's present value: ");
        double presentValue = userInput.nextDouble();
        // Ask the user to enter the monthly interest rate as a decimal
        System.out.println("Please enter the monthly interest rate as a decimal: ");
        double monthlyInterestRate = userInput.nextDouble();
        // Ask the user to enter the number of months the money will remain in the account 
        System.out.println("Please enter the number of months the money will remain in the account: ");
        double numberMonths = userInput.nextDouble();

        // Call the futureValue method and assign it to a variable
        double futureValueCalculation = futureValue(presentValue, monthlyInterestRate, numberMonths);
        System.out.println("Here is the final calculations: " + futureValueCalculation);
    }
    // Create a modular method called futureValue
    public static double futureValue(double presentValue, double monthlyInterestRate, double numberMonths) {
        double exponentialFragment = Math.pow(1+ monthlyInterestRate, numberMonths);
        return presentValue * exponentialFragment;
    }
}