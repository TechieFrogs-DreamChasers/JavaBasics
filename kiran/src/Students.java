public class Students {
    int roll;
    int phone;
    String address;

    public static void main(String[] args) {
       Students studentsObj = new Students();
       Students studentsObj2 = new Students();
       studentsObj.roll = 84;
       studentsObj.phone = 123456789;
       studentsObj.address = "India";

       studentsObj2.roll = 44;
       studentsObj2.phone = 987456321;
       studentsObj2.address = "India";

       System.out.println("Roll No : "+studentsObj.roll+ " & "+"Phone No :"+ " & "+ studentsObj.phone+" Address :  " +studentsObj.address);
       System.out.println("Roll No : "+studentsObj2.roll+ " & "+"Phone No :"+ " & "+ studentsObj2.phone+" Address :  " +studentsObj2.address);
  
    }
    
}
