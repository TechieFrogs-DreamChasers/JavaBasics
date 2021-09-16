package Assignment3.Exercise3;

public class Member {

        String name;
        int age;
        String phoneNumber;
        String address;
        double salary;

        Member(String name,int age,String phoneNumber,String address,double salary){
            this.name = name;
            this.age = age;
            this.phoneNumber = phoneNumber;
            this.address = address;
            this.salary = salary;
        }

        void printSalary(){
            System.out.println("Salary of the Members: " + salary);

        }

        
        void printDetails(){
            System.out.println("Name: "+ name);
            System.out.println("Age: " + age);
            System.out.println("PhoneNumber: " + phoneNumber);
            System.out.println("Address: " + address);
            System.out.println("Salary: " + salary);

        }

        /*public String getName() {
            return name;
        }
    
        public int getAge() {
            return age;
        }
    
        public String getPhone_Number() {
            return phoneNumber;
        }
    
        public String getAddress() {
            return address;
        }
    
        public double getSalary() {
            return salary;
        }*/

}
