package Assignment3.Exercise3;

public class Manager extends Member{
    
    String department;

    
        Manager(String name,int age,String phoneNumber,String address,double salary,String department){
            super(name,age,phoneNumber,address,salary);
            this.name = name;
            this.age = age;
            this.phoneNumber = phoneNumber;
            this.address = address;
            this.salary = salary;
            this.department = department;
        }

        /*public String getDepartment() {
            return department;
        }*/

        @Override
        public void printDetails() {
            super.printDetails();
            System.out.println("Department: "+ department);
        }

}
