package ClassesAndObjects;

public class Employee { // 10.Printing Employee details
    String name;
    int yearOfJoining;
    double salary;
    String address;

    void showDetails(){
        System.out.println(name +"        "+ yearOfJoining +"            "+ salary +"      "+ address);

    }

    public static void main(String[] args){
        Employee emp1 = new Employee("Robert",1994,98000.00,"64C-WALLStreet");
        Employee emp2 = new Employee("Sam",2000,80000.00,"68D- WallStreet");
        Employee emp3 = new Employee("John",1999,89000.00,"26B-WallsStreat");
        System.out.println("Name       Year Of Joining     Salary      Address");
        emp1.showDetails();
        emp2.showDetails();
        emp3.showDetails();

    }

    Employee(String name,int yearOfJoining,double salary,String address){
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

}
