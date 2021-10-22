//Handle CloneNotSupportException
public class Program16 {
    public static void main(String[] args) {
        Employee employee = new Employee("Adam", 100012, 29, 50000);
        System.out.println("Before Clone: ");
        System.out.println(employee);
        try {
            System.out.println("After Clone: ");
            Employee copy = (Employee) employee.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.initCause(e.getCause()));
        }
        System.out.println("Out of Try+Catch Block");
    }
}

class Employee {
    private String name;
    private int id;
    private int age;
    private int salary;

    public Employee() {
    }

    public Employee(String name, int id, int age, int salary) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.salary = salary;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Employee: \nName: " + name + "\t Id: " + id + "\t Age: " + age + "\t Salary: " + salary;
    }
}
/*
Before Clone:
Employee:
Name: Adam	 Id: 100012	 Age: 29	 Salary: 50000
After Clone:
java.lang.CloneNotSupportedException: Employee
Out of Try+Catch Block
 */