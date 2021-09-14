package Practice.Inheritance;

public class Programer extends Employee {

    int salary = 50000;

    //super for constructor- we should give super in the firstline 
    //because programer extends Employee
    Programer(){
        super();
        //System.out.println("Programmer Constructor");
    }

    void display(){

        System.out.println("Salary of the Employee: " + salary);

        //super for Variable:
       // System.out.println("Salary of the Employee: " + super.salary);

       //super for method
       super.display();
    }

    /*public Programer(int salary){

        this.salary = salary;

    }*/


    //we cannot access super and this inside the static
    public static void main(String[] args) {
       
        Programer obj = new Programer();
        obj.display();
        //obj.display();
        
        
    }
    
}
