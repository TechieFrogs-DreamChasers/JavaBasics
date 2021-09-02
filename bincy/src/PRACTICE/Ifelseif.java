package PRACTICE;
import java.util.Scanner;

public class Ifelseif {
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        System.out.print("Enter your mark:");
        int mark= n.nextInt();
        n.close();
        if(mark>90)
            System.out.println("A grade");
        else if(mark>80)
            System.out.println("B grade");
        else if(mark>70)
            System.out.println("C grade");
        else if(mark>60)
            System.out.println("D grade");
        else{
            System.out.println("Redo");
        }    
    }
    
}
