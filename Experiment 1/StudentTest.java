/*
   Aim: WAP to store and display the student information of few students Information like NAME,UIN,CGPA
   Student Name: Ashaz Shakir Patel
   Class: SE Comp Div A
*/

// Main class containing the driver code
public class StudentTest {
    public static void main(String[] args) 
    {
       // Creating and initializing object 1
       Student s1 = new Student();
       s1.name = "Ashaz Shakir Patel";
       s1.uin = "25P140";
       s1.cgpa = 7.91;
       s1.display();

       // Creating and initializing object 2
       Student s2 = new Student();
       s2.name = "Maaz";
       s2.uin = "25P139";
       s2.cgpa = 8.1;
       s2.display();

       // Creating and initializing object 3
       Student s3 = new Student();
       s3.name = "Ibrar";
       s3.uin = "25P138";
       s3.cgpa = 7.5;
       s3.display();
    }
}

// Blueprint class representing a Student entity
class Student {
    // Instance variables (attributes)
    String name;
    String uin;
    double cgpa;

    // Method to display student attributes with line spacing
    void display() {
        System.out.println("xxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Name: " + name + "\n");   
        System.out.println("UIN: " + uin + "\n");
        System.out.println("CGPA: " + cgpa + "\n");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxx\n");
    }
}
