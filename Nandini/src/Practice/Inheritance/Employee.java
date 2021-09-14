package Practice.Inheritance;

public class Employee //extends objects 
{
    int salary = 60000;
    String name = "John";

    Employee(){

            System.out.println("Employee Constructor");
    }

    void display(){

        System.out.println("Name of the Employee: " + name);
    }
    
}
