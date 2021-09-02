import java.util.Scanner;

public class assignment7 {
    public static void main(String[] args){
        Scanner scannerObj = new Scanner(System.in);
                System.out.println("Enter the Character");
        char ch = scannerObj.next().charAt(0);
            if((ch >='A' && ch <= 'Z') || (ch >='a' && ch <= 'z')){
                System.out.println(ch+" is an Alphabet");
            }
            else
        {
               System.out.println(ch+" is not an Alphabet");
        scannerObj.close();
        }
            }





    }
    

