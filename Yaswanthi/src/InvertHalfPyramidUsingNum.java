import java.util.Scanner;

public class InvertHalfPyramidUsingNum {
    public static void main(String[] args)   
{  
int i, j, rows; 
Scanner sc = new Scanner(System.in);
System.out.println("Enter the numner of rows");
rows = sc.nextInt(); 
for (i = rows; i >= 1; i--)   
{  
for (j = 1; j <= i; j++)  
{  
System.out.print(j+" ");  
}  
System.out.println();  
}  
}  
    
}
