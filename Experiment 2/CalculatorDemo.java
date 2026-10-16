/*
Aim:WAP to create a calculator class to add two numbers.
Use constructor overloading to initialize the data with either default values or user provided values. 
Use method overloading to add integer or double.
Student Name: Ashaz Shakir Patel
Class: SE Comp Div A 
*/

import java.util.Scanner;

// Calculator class demonstrates constructor overloading and method overloading
class Calculator {

    double num1, num2;

    // Default constructor - sets values to 0.0
    Calculator() {
        this.num1 = 0.0;
        this.num2 = 0.0;
    }

    // Parameterized constructor - sets user provided values
    Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Overloaded method - adds integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method - adds doubles
    double add(double a, double b) {
        return a + b;
    }

    double addStoredValues() {
        return num1 + num2;
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc;

        System.out.println("1. Use default values (0.0, 0.0)");
        System.out.println("2. Enter your own values");
        System.out.print("Enter choice (1 or 2): ");
        int choice = sc.nextInt();

        if (choice == 2) {
            System.out.print("Enter first number: ");
            double n1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double n2 = sc.nextDouble();
            calc = new Calculator(n1, n2);   // calls parameterized constructor
        } else {
            calc = new Calculator();          // calls default constructor
        }

        System.out.println("Sum of stored values: " + calc.addStoredValues());

        System.out.println("\n1. Add two integers");
        System.out.println("2. Add two doubles");
        System.out.print("Enter choice (1 or 2): ");
        int typeChoice = sc.nextInt();

        if (typeChoice == 1) {
            System.out.print("Enter first integer: ");
            int a = sc.nextInt();
            System.out.print("Enter second integer: ");
            int b = sc.nextInt();
            int result = calc.add(a, b);      // calls int version
            System.out.println("Sum of integers: " + result);
        } else {
            System.out.print("Enter first double: ");
            double a = sc.nextDouble();
            System.out.print("Enter second double: ");
            double b = sc.nextDouble();
            double result = calc.add(a, b);   // calls double version
            System.out.println("Sum of doubles: " + result);
        }

        sc.close();
    }
}
