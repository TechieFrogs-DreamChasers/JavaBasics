import java.util.Scanner;
public class HalfPyramidUsingNumbers {
    public static void main(String[] args)
{
int n, i, j ,number;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
n = sc.nextInt();
for(i = 0; i < n; i++)
{
    number = 1;
for(j = 0; j <= i; j++)
{
System.out.print(number +" ");
number++;
}
System.out.print("\n");
}
}
}
    

