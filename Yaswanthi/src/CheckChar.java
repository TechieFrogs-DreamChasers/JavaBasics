import java.util.Scanner;
  public class CheckChar {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char ch;     
        System.out.println("Enter the character ");
        ch=sc.next().charAt(0);   
        
        if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
        {
             System.out.print(ch+" is an Alphabet ");
        }
        else
        {
             System.out.print(ch+" is not an Alphabet ");
        }
    }
    
}
