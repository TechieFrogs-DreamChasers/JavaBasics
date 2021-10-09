package Arrays8;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {
        
        System.out.println("Enter the Length: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        sc.nextLine();
        sc.close();
        int[] in = new int[length];
        for (int i = 0; i < in.length; i++) {
            in[i] = (int) (Math.random() * 100) + 1;
        }

        Arrays.sort(in);
        System.out.println("After Sorting "+ Arrays.toString(in));
        
        System.out.println("Second Smallest: "+ in[1]);
    }
    
}

