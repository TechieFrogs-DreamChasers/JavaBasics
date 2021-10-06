import java.util.Arrays;
import java.util.Scanner;
//Print reverse order of elements of an array
public class Program6 {
    public static void main(String[] args) {
        System.out.println("Enter the length: ");
        Scanner sc=new Scanner(System.in);
        int length= sc.nextInt();
        sc.nextLine();
        sc.close();
        int [] numbers=new int[length];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=(int)(Math.random()*100)+1;
        }
        System.out.println("The elements Before reversing: "+Arrays.toString(numbers));
        int[] reverse=new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            reverse[numbers.length-i-1]=numbers[i];
        }
        System.out.println("The elements After reversing: "+Arrays.toString(reverse));
    }
}
/*
Enter the length:
10
The elements Before reversing: [11, 61, 24, 26, 72, 26, 69, 15, 27, 24]
The elements After reversing: [24, 27, 15, 69, 26, 72, 26, 24, 61, 11]
*/
