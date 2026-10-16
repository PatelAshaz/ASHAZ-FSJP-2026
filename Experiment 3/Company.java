/*
AIM: WAP to create a program demonstrating multilevel inheritance using the classes
Person, Employee, and Manager. Accept the manager details and display them. Handle
invalid salary input using exception handling.
Student Name: Ashaz Shakir Patel
Class: SE Comp Div A
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Company {
	public static void main(String agrs[]) {
		try {
			Scanner sc = new Scanner(System.in);

			//TODO: Taking all inputs from the user
			System.out.println("Welcome to the Company Program");
			System.out.println("=================================================");
			System.out.print("Enter Name: ");
			String name = sc.nextLine();
			System.out.print("Enter Gender: ");
			String gender = sc.next();
			sc.nextLine();
			System.out.print("Enter City: ");
			String city = sc.nextLine();
			System.out.print("Enter Age: ");
			int age = sc.nextInt();
			sc.nextLine();
			//---------------------------------------------------------
			System.out.print("Enter Department: ");
			String department = sc.nextLine();
			System.out.print("Enter Job Title: ");
			String job_title = sc.nextLine();
			System.out.print("Enter Employee ID: ");
			long emp_id = sc.nextLong();
			System.out.print("Enter Salary: ");
			long salary = sc.nextLong();
			//----------------------------------------------------------
			System.out.print("Enter No. of Projects: ");
			int projs = sc.nextInt();
			System.out.print("Enter No. of Team Members: ");
			int team_members = sc.nextInt();
			System.out.print("Enter Total Budget for Project: ");
			long budget = sc.nextLong();
			System.out.print("Enter Total expense for Project: ");
			long expense = sc.nextLong();

			//Creating object of Manager class
			Manager M1 = new Manager(name, gender, city, age, department, job_title, emp_id, salary, projs, team_members, budget, expense);
			M1.display();

		} catch(InputMismatchException e) {
			//TODO: Handling exception by throwing error message easy for user to understand
			System.out.println("\nError: Entered Invalid Input for previous statement");
			System.out.println("Please try again by restarting the program");
		}

	}
}
