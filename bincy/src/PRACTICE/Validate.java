package PRACTICE;

import java.util.Scanner;

//validate integer
public class Validate {
    public static void main(String[] args){
    
        int mark;
        Scanner obj = new Scanner(System.in);
        
        
        do
        {
        
             System.out.println("Enter your mark: ");

            while(!obj.hasNextInt()){

                System.out.println("Please enter a valid mark: ");
                obj.next();
            }
            mark = obj.nextInt();
        
        }while(mark<=0);
        System.out.println("Entered mark: "+ mark);

        String st = validate(obj);
        System.out.println(st);

        
        obj.close();
    }
    static String validate(Scanner scannerObj){ //validate method definition
        String st;
        do{
            System.out.println("Enter sentence");
            while(!scannerObj.hasNext("[A-Za-z]*")){
                System.out.println("This is not a String.Please enter valid String:");
                scannerObj.next();
            }
            st = scannerObj.nextLine();
        }while(st.equals(""));
      return st;
    }
}
