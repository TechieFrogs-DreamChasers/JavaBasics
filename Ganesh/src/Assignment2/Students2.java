package Assignment2;

public class Students2 {
   String name;
   int roll_no;
   long Phone_No;
   String address;

   Students2(String name,int roll_no,long Phone_no,String address){
       this.name = name;
       this.roll_no = roll_no;
       this.Phone_No = Phone_no;
       this.address = address;
      
   }
   public static void main(String[] args){
       Students2 obj1 = new Students2("John",2,995895846,"68D-WallsStreet");
       Students2 obj2 = new Students2("Sam",3,566859425,"28B-Wallstreet");
       System.out.println("Student 1 :" + obj1.name+" "+obj1.roll_no+" "+ obj1.Phone_No+" "+ obj1.address);
      
       System.out.println("Student 2 :" + obj2.name+" "+ obj2.roll_no+" "+ obj2.Phone_No+" "+ obj2.address);
     
   }
}
