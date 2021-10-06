class Member {
    String name;
    int age;
    String phnumber;
    String address;
    int salary;

   public void printsalary(){
       System.out.println(salary);
   } 
}

class Employee extends Member{
    String specialization;
}

class Manager extends Member{
    String department;
}

class Details{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp . name = "Sagar";
        emp . age = 26;
        emp . phnumber = "9978451299";
        emp . address = "Banglore";
        emp . salary = 231456;
        emp . specialization = "Marketing";

        Manager man = new Manager();
        man . name = "Aman";
        man . age = 35;
        man . phnumber = "9987542199";
        man. address = "Chennai";
        man. salary = 365412;
        man. department = "Marketing";
    }
}
