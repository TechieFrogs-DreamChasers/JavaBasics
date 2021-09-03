import java.util.Scanner;

public class GCD {
    public static void main(String[] args)   
{  
int n1, n2;  
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of n1");
n1 = sc.nextInt();
System.out.println("Enter the value of n2");
n2 = sc.nextInt();
while(n1!=n2)   
{  
if(n1>n2)  
n1=n1-n2;  
else  
n2=n2-n1;  
}  
System.out.printf("GCD of n1 and n2 is: " +n2);  
}  
    
}
