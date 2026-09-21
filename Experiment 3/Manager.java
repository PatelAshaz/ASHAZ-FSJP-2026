/*
AIM: WAP to create a program demonstrating multilevel inheritance using the classes
Person, Employee, and Manager. Accept the manager details and display them. Handle
invalid salary input using exception handling.
Student Name: Ashaz Shakir Patel
Class: SE Comp Div A
*/

public class Manager extends Employee{
    private int no_of_projects;
    private int total_team_members;
    private long total_budget;
    private long total_expenses;

    //Parameterized constructor to set all values for all variables
    Manager(String name, String gender, String city, int age, String department, String job_title, long emp_id, long salary, int no_of_projects, int total_team_members, long total_budget, long total_expenses){
	super(name, gender, city, age, department, job_title, emp_id, salary);
	this.no_of_projects = no_of_projects;
    	this.total_team_members = total_team_members;
    	this.total_budget = total_budget;
    	this.total_expenses = total_expenses;
    }

    //Method to display all the variables in this class
    void display(){
	super.display();
	System.out.println("-------------------------------------------");
    	System.out.println("No. of Projects:\t\t" + this.no_of_projects);
    	System.out.println("No. of Team Members:\t\t" + this.total_team_members);
    	System.out.println("Total Budget for Project:\t" + this.total_budget);
    	System.out.println("Total Expenses for Project:\t" + this.total_expenses);
    }
}
