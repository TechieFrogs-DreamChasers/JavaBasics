import java.util.Scanner;

public class InvertedHalfPyramid
{
public static void main(String[] args)  
{  
int rows; 
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of rows");  
rows = sc.nextInt();
 for (int i= rows-1; i>=0 ; i--)  
{  
  for (int j=0; j<=i; j++)  
{  
  System.out.print("* ");  
}  
 System.out.println();  
}  
}   
    
}
