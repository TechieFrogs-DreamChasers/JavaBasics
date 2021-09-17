public class Member {
    String Name;
    int Age;
    String Pno;
    double salary;
    float add;
    void printSalary(){
        System.out.println(salary);
    }
public static void main(String[] args) {
    Employee e=new Employee();
    e.Name="likitha";
    e.Age=25;
    e.Pno="0433903397";
    e.salary=800000;
    e.add=3/3;
    e.Specialization="Masters";
    e.printSalary();
    System.out.println(e.Name+" "+e.Age+" "+e.Pno+" "+e.add+" "+e.salary+" "+e.Specialization);
    Manager m=new Manager();
    m.Name="snepo";
    m.Age=26;
    m.Department="cse";
    m.Pno="123456789";
    m.add=166;
    m.salary=500000;
    m.printSalary();
System.out.println(m.Name+" "+m.Age+" "+m.Department+" "+m.Pno+" "+m.add+" "+m.salary);
}
}
 class Employee extends Member{
     String Specialization;

}
class Manager extends Member{
String Department;
}
