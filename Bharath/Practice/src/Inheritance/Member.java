package Inheritance;

public class Member {
    String Name = "Bharath";
    int Age = 18;
    int Phonenumber = 4055278;
    String Address = "Sydney";
    int Salary = 5000;


    void printSalary(){
        System.out.println("Salary of the members");
    }
}

class Employee extends Member{

    String Specialisation = "Java";

    public static void main(String[] args) {
        Employee x1 = new Employee();
        x1.printSalary();
        System.out.println(x1.Specialisation+" "+x1.Name+" "+x1.Age+" "+x1.Phonenumber+" "+x1.Address+" "+x1.Salary);
    }

}

class Manager extends Member{

    String Department = "Developing";

    public static void main(String[] args) {
        Manager x2 = new Manager();
        x2.printSalary();
        
        System.out.println(x2.Department+" "+x2.Name+" "+x2.Age+" "+x2.Phonenumber+" "+x2.Address+" "+x2.Salary);
        
    }

}