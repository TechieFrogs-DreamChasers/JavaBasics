package assign;
 class Member {
    int age;
    long Pn;
    int sal;
    String name;
    String address;
   

    void printsalary(){
        System.out.println(" print the salary of employee ="+" ");
    }
    }
class Employee extends Member { 
    String dpt;
    
    
}
class Manager extends Member{
    
String spl;    
}
public class Assign3{
    public static void main(String[]args){
        Employee obj1 = new Employee();
obj1.Pn= 9491878362L;
obj1.address="wall street";
obj1.age=25;
obj1.dpt="Research";
obj1.name="Noah";
obj1.sal=2500;
System.out.println("name and salary of employee:"+" "+obj1.name+" "+obj1.sal);
Manager obj2 = new Manager();
obj2.Pn=9491878363L;
obj2.address="General street";
obj2.age=30;
obj2.name="Ram";
obj2.sal=3000;
obj2.spl="product reasearch";
System.out.println("name and display of Manager"+" "+obj2.name+" "+obj2.sal);

        



        


    }
}
