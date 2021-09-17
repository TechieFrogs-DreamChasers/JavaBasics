package Assignment3.Exercise3;

public class Main {

    public static void main(String[] args) {
            
        Employee e = new Employee("John",30,"9387656720","76B-VINE",40000,"Developer");
        Manager m = new Manager("Sam",34,"9381326720","98H-ADAMS",50000,"Health Department");

        System.out.println("Manager Details: ");
        System.out.println(" ");
        m.printDetails();

        System.out.println(" ");
        
        System.out.println("Employee Details");
        System.out.println(" ");
        
        e.printDetails();

    }
    
}
