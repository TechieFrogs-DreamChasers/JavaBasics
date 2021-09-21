public class Mumber {
    String name;
    int phonenumber;
    String address;
    float salary;

     void printsalary(){
         System.out.println("print salary");
     }

    }
    class employee extends Mumber{
        String specialization;
        String deportment;

        void employeeprint(){
            System.out.println(name  + " , " + phonenumber +" , " +address + " ," + salary +"," +specialization+","+deportment);
        }

      employee(String newname, int newphone, String newaddress, float newsalary,String newspecialization,String newdeportment)
      {
          this.name=newname;
          this.phonenumber=newphone;
          this.address=newaddress;
          this.salary=newsalary;
          this.specialization=newspecialization;
          this.deportment=newdeportment;
        }

     public static void main(String[] args) {
         employee oEmployee = new employee("siri",123,"hyd", 1500000.00f,"javadevolaper","software");
         oEmployee.employeeprint();
        }
    }

     class manager extends Mumber{
        String specialization;
        String deportment;
        void managerprint(){

        } 

    }
     
