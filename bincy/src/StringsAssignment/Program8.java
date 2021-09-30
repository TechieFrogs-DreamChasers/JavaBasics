package StringsAssignment;

import java.util.Scanner;

public class Program8 {
   public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
       String str =obj.nextLine();
       obj.close();
       int count=0;
       int len = str.length();
       for (int i =0; i<len; i++){
           char  ch = str.charAt(i);
           System.out.println(ch);
          switch(ch){
              case '0': case '1': case '2': case '3': case '4': case '5': 
              case '6': case '7': case '8': case '9':
                break;
              default:
                count = 1;
          }           
           
        }
        if(count == 0){
            System.out.println("String is numeric");
        }
        else{
            System.out.println("Not numeric");
        }
   }
}
