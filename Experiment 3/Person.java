/*
AIM: WAP to create a program demonstrating multilevel inheritance using the classes
Person, Employee, and Manager. Accept the manager details and display them. Handle
invalid salary input using exception handling.
Student Name: Ashaz Shakir Patel
Class: SE Comp Div A
*/

public class Person{
    private String name;
    private String gender;
    private String city;
    private int age;

    //Parameterized constructor to set all values for all variables
    Person(String name, String gender, String city, int age){
	this.name = name;
    	this.gender = gender;
    	this.city = city;
    	this.age = age;
    }

    //Method to display all the variables in this class
    void display(){
	System.out.println("-------------------------------------------");
    	System.out.println("Name:\t" + this.name);
    	System.out.println("Gender:\t" + this.gender);
    	System.out.println("City:\t" + this.city);
    	System.out.println("Age:\t" + this.age);
    }
}
