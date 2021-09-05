import java.util.Scanner;


public class Alphabets {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);

        char ch;
        for(ch='a'; ch<='z'; ++ch)
        {
            System.out.print(ch+" ");
            
        }
        System.out.println();
        for(ch='A'; ch<='Z'; ++ch)
        {
            System.out.print(ch+" ");
        }
        

        scannerObj.close();
    }
}
