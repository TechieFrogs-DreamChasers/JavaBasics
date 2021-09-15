package assign;
 class Member {
    int age;
    long Pn;
    int sal;
    String name;
    String address;
    Member(String name, int age, long Pn, String address, int sal){
        this.name=name;
        this.age=age;
        this.Pn=Pn;
        this.address=address;
    }
    void printsalary(){
        System.out.println(" print the salary of employee ="+" ");
    }
    }
class Employee extends Member { 
    Employee(String name, int age, long Pn, String address, int sal) {
        super(name, age, Pn, address, sal);
        //TODO Auto-generated constructor stub
    }
    
}
class Manager extends Member{
    Manager(String name, int age, long Pn, String address, int sal) {
        super(name, age, Pn, address, sal);

  Void  dpt(){
      System.out.println("ob1.name, ob1.age, ob1.Pn, ob1.address, ob1.sal");
  }


    
}
public class Assign3{
    public static void main(String[]args){
        Employee ob1 = new Employee("sam",25, 9491878362L, "wall street", 2500);
Manager obj2 = new Manager ("ram", 30, 9491878362L,"GENERAL STREET", 5000);
System.out.println(obj);
System.out.println();




        


    }
}
}