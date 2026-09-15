/*
Problem 2: Celsius Temperature Table

The following formula converts a Fahrenheit temperature to Celsius:

C = (5 ÷ 9) × (F − 32)

Where:

F is the Fahrenheit temperature.
C is the Celsius temperature.

Write a Java method named:

celsius

The method must:

Accept a Fahrenheit temperature as a parameter.
Convert the temperature to Celsius.
Return the Celsius temperature as a double.

In the main method, use a loop to display a temperature table containing Fahrenheit temperatures from 0 through 20 and their Celsius equivalents.

Format Celsius temperatures to two decimal places.

Example Format
Fahrenheit     Celsius
----------------------
0              -17.78
1              -17.22
2              -16.67

Your program must calculate every Celsius value by calling the celsius method.

Required Filename
CelsiusTable.java
*/
import java.util.Scanner;

public class CelsiusTable {
    public static void main(String[] args) {
        // Declare and initialize the scanner object
        Scanner userInput = new Scanner(System.in);

        // Use a loop to display a temperature table containing F temperature 
        // values from 0 to 20 and their C equivalents
        for (int i = 1; i <= 20; i++) {
            // Ask the user to enter 20 F temperature values using a for loop 
            System.out.println("Please enter a Fahrenheit value(we will do this 20 times!): ");
            double fahrenheitTemperature = userInput.nextDouble();

            // Call the celsius method
            double conversionTemperature = celsius(fahrenheitTemperature);
            System.out.println("Fahrenheit: " + fahrenheitTemperature + ", Celsius: " + conversionTemperature);
        }
    }
    //Write a java method named celsius
    public static double celsius(double fahrenheitTemperature) {
        return ((5.0 / 9.0) * (fahrenheitTemperature - 32));
    }
}
