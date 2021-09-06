class Member{
    String name;
    int age;
    String number;
    String address;
    int salary;
  
    public void printSalary(){
      System.out.println(salary);
    }
  
  }
  
  class Employee extends Member{
    String specialization;
  }
  
  class Manager extends Member{
    String department;
  }
  
  class Inher{
    public static void main(String[] args){
      Employee e = new Employee();
      e.name = "maddy";
      e.age = 23;
      e.number = "9866789";
      e.address = "123 gfghg gugu";
      e.salary = 12000;
      e.specialization = "developer";

      System.out.println(e.name+ " "+e.salary);
  
      Manager m = new Manager();
      
      m.name = "Lucky";
      m.age = 26;
      m.number = "9866789";
      m.address = "123 gfghg gugu";
      m.salary = 23000;
      m.department = "technical";

      System.out.println(m.name+ " "+m.salary);
    }
  }									