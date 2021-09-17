package Assignment3.Exercise3;

public class Employee extends Member{
    
    String specialization;

    
        Employee(String name,int age,String phoneNumber,String address,double salary,String specialization){
            super(name,age,phoneNumber,address,salary);
            this.name = name;
            this.age = age;
            this.phoneNumber = phoneNumber;
            this.address = address;
            this.salary = salary;
            this.specialization = specialization;
        }

        /*public String getSpecialization() {
            return specialization;
        }*/

        @Override
        public void printDetails() {
            super.printDetails();
            System.out.println("Specialization: " + specialization);
        }
}
