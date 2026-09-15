/*

Problem 1: Kinetic Energy

An object in motion has kinetic energy. The following formula calculates an object’s kinetic energy:

KE = ½ × m × v²

Where:

KE is the kinetic energy.
m is the object’s mass in kilograms.
v is the object’s velocity in meters per second.

Write a Java method named:

kineticEnergy

The method must:

Accept the object’s mass and velocity as parameters.
Calculate the object’s kinetic energy.
Return the calculated kinetic energy as a double.

In the main method:

Ask the user to enter the object’s mass in kilograms.
Ask the user to enter its velocity in meters per second.
Call the kineticEnergy method.
Display the returned kinetic energy.

Format the result to two decimal places.

Required Filename
KineticEnergy.java
*/
import java.util.Scanner;

public class KineticEnergy {
    public static void main(String[] args) {
        // Declare and initialize the scanner object
        Scanner userInput = new Scanner(System.in);

        // Ask the user to enter the object's mass in kilograms
        System.out.println("Please enter the object's mass in kilograms: ");
        double mass = userInput.nextDouble();
        // Ask the user to enter its velocity in meters per second
        System.out.println("Please enter the object's velocity in meters per second: ");
        double velocity = userInput.nextDouble();

        // Call the kineticEnergy method
        double calculatedKE = kineticEnergy(mass, velocity);
        // Display the returned kinetic energy and format the result to two decimal places
        System.out.println("Here's the object's calculated KE: " + calculatedKE + " joules(J)");
    }
    // Write a java method named kineticEnergy
    public static double kineticEnergy(double mass, double velocity) {
        return 0.5 * mass * velocity * velocity;
    }
}
