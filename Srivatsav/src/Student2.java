public class Student2 {
    int roll_number;
    int phone_number;
    String address;
    public static void main(String[] args) {
    
        Student2 Sam = new Student2();
    
        Student2 John = new Student2();
    
        Sam.roll_number = 18;
    
        Sam.phone_number = 1234567890;
    
        Sam.address = "Germany";
    
        John.roll_number = 25;
    
        John.phone_number = 1234567809;
    
        John.address = "Turkey";

        System.out.println("Sam's "+Sam.roll_number+" "+Sam.phone_number+" "+Sam.address);
        System.out.println("John's "+John.roll_number +" " + John.phone_number +" " + John.address); 


    }    
}
