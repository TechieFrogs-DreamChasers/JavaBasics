public class Employee {
    String name;
    int join_Year;
    String address;

    public Employee(String name, int join_Year, String address) {
        this.name = name;
        this.join_Year = join_Year;
        this.address = address;
    }
    public static void main(String[] args) {
        System.out.println("Name      Year     Address");
        Employee employee1=new Employee("Robert",1994,"64C-Wall Street");
        employee1.printDetails();
        Employee employee2=new Employee("Sam",2000,"68B-Wall Street");
        employee2.printDetails();
        Employee employee3=new Employee("John",1999,"26B-Wall Street");
        employee3.printDetails();
    }
    void printDetails(){
        System.out.println(name+"    "+join_Year+"    "+address);
    }
}
