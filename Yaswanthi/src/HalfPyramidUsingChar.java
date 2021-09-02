import java.util.Scanner;

public class HalfPyramidUsingChar {
    public static void main(String[] args)  
{  
int letter = 65 ,n;  
Scanner sc = new Scanner(System.in);
System.out.println("Enter no. of rows");
n = sc.nextInt() ;
for (int i = 0; i<= n; i++)  
{  
 
for (int j = 0; j <= i; j++)  
{  

System.out.print((char) letter + " ");  
}  
letter++;  
System.out.println();  
}  
}  
    
}
