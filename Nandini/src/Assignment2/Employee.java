package Assignment2;

public class Employee {
    
    String name;
    int yearofJoining;
    double salary;
    String address;

    public Employee(String name,int yearofJoining,double salary,String address){

        this.name = name;
        this.yearofJoining = yearofJoining;
        this.salary = salary;
        this.address = address;
    }

    public static void main(String[] args) {
        
        Employee employee1 = new Employee("Robert", 1994, 25000, "64C-WallStreat");
        Employee employee2 = new Employee("Sam", 2000, 25000, "68D-WallStreat");
        Employee employee3 = new Employee("John", 1999, 25000, "26B-WallStreat");

        System.out.println("Name"+"    "+"Year of Joining"+"     "+"Salary"+"    "+"Address");

        employee1.show();
        employee2.show();
        employee3.show();
    }

    void show(){
        System.out.println(name+"        "+yearofJoining+"            "+salary+"    "+address);
    }
}
