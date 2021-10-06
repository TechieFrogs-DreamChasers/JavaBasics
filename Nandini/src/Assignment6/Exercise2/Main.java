package Assignment6.Exercise2;

public class Main {
    

    public static void main(String[] args) {

         Employee[] emp = new Employee[5];
        emp[0] = new Employee("John",30000);
        emp[1] = new Employee("Sam",20000);
        emp[2] = new Employee("Lori",50000);
        emp[3] = new Employee("Robert",35000);
        emp[4] = new Employee("Lincoln",45000);

        double averageSalary = Employee.average(emp);
        System.out.println(averageSalary);
    }
    
}
