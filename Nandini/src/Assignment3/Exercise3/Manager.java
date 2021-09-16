package Assignment3.Exercise3;

public class Manager extends Member{
    
    String department;

    public static void main(String[] args) {
            
        Employee e = new Employee();
        Manager m = new Manager();

        e.name = "John";
        e.age = 30;
        e.phoneNumber = "9387656720";
        e.address = "76B-VINE";
        e.salary = 40000;

        m.name = "Sam";
        m.age = 34;
        m.phoneNumber = "9381326720";
        m.address = "98H-ADAMS";
        m.salary = 50000;

        System.out.println("Manager Details: ");
        System.out.println(" ");
        m.printDetails();

        System.out.println(" ");
        
        System.out.println("Employee Details");
        System.out.println(" ");
        e.printDetails();

    }

}
