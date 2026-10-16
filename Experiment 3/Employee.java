/*
AIM: WAP to create a program demonstrating multilevel inheritance using the classes
Person, Employee, and Manager. Accept the manager details and display them. Handle
invalid salary input using exception handling.
Student Name: Ashaz Shakir Patel
Class: SE Comp Div A
*/

public class Employee extends Person{
    private String department;
    private String job_title;
    private long  emp_id;
    private long salary;

    //Parameterized constructor to set all values for all variables
    Employee(String name, String gender, String city, int age, String department, String job_title, long emp_id, long salary){
	super(name, gender, city, age);
	this.department = department;
    	this.job_title = job_title;
    	this.emp_id = emp_id;
    	this.salary = salary;
    }

    //Method to display all the variables in this class
    void display(){
	super.display();
	System.out.println("-------------------------------------------");
    	System.out.println("Department:\t" + this.department);
    	System.out.println("Job Title:\t" + this.job_title);
    	System.out.println("Employee Id:\t" + this.emp_id);
    	System.out.println("Salary:\t\t" + this.salary);
    }
}
