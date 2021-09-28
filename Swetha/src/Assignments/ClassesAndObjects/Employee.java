public class Employee {
    String name;
    int YearOfJoining;
    double salary;
    String address;

    Employee(String name,int YearOfJoining,double salary,String address){
        this.name=name;
        this.YearOfJoining=YearOfJoining;
        this.salary=salary;
        this.address=address;
    }
    public static void main(String[] args) {
        System.out.println("Name     Year     Salary     Address:");
        Employee emp1=new Employee("Robert",1994,5000,"64C-Wall Street");
        emp1.printDetails();
        Employee emp2=new Employee("Sam",2000,5000,"68D-Wall Street");
        emp2.printDetails();
        Employee emp3=new Employee("John",2004,5000,"26B-Wall Street");
        emp3.printDetails();    
    }
    private void printDetails() {
        System.out.println(name+"     "+YearOfJoining+"     "+salary+"     "+address);
    }

    
    
    
}
