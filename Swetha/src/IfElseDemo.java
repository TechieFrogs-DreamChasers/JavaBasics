public class IfElseDemo {
    public static void main(String[] args) {
         int age=16;
        int wieght=60;
        String gender="Male";

        if (age > 18) //{
            System.out.println("Eligible"); //without curlybraces only single statement is allowed this is only for If block not for else block
            //System.out.println("Inside If block");     //If can be given without Else Block
                                                       //but only Else block is not allowed
       // }                                              //Else Block should be immidiately followed by If block
        else//{        
        System.out.println("Not Eligible");
       // }

        System.out.println("After the Else Block ");
      }
    
}
