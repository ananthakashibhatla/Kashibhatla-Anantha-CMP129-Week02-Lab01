CMP 129 – Computer Science II
Week 2 – Lab 1: Methods and Return Values
Learning Objectives

After completing this lab, students should be able to:

Create Java methods that accept parameters.
Return calculated values from methods.
Call methods from the main method.
Apply mathematical formulas in Java.
Use loops with methods.
Format and display calculated results.

Complete all three programming problems. Create a separate Java file for each problem.

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
General Requirements
Include your name, course number, week, lab number, and date in a comment at the beginning of each Java file.
Create and call each method exactly as required.
Keep user input and output inside the main method.
Use appropriate parameter and return data types.
Use meaningful names for variables and parameters.
Use Math.pow() when an exponent is required.
Format numerical results as instructed.
Include comments explaining important parts of the programs.
Test each program using different input values.
Each program must compile and run without errors.
You must be able to explain every method and calculation you submit.
Follow the course AI-use policy.
Record any AI assistance in AI-Use-Report.md.
Submission

Push the following files to the Week 2 GitHub repository:

KineticEnergy.java
CelsiusTable.java
FutureValue.java
AI-Use-Report.md

Make at least two meaningful commits while completing this lab. Use commit messages that describe your progress.
