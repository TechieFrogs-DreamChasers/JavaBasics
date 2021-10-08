package Arrays8;

import java.util.Arrays;

public class ThirdLargestNum {
    public static void main(String[] args) {
        
        int[] in = {12,89,34,7,0,28,4,18};

        Arrays.sort(in);
        
        System.out.println("Third Largest Number: "+ in[in.length-3]);

     
        //another Method
        
        /*int[] in = {12,89,34,7,0,28,4,18};

       // System.out.println("Before Sorting "+ Arrays.toString(in));
        System.out.println("Before Sorting ");
        for(int i=0;i<in.length;i++)
        System.out.print(in[i]+ " ");

        Arrays.sort(in);

        int afterSorting[] = new int[in.length];

        //Assigning values of in to aftersorting
        System.out.println();
        for(int i=0;i<in.length;i++){
            afterSorting[in.length-i-1] = in[i];
        }

        System.out.println("After Sorting ");
        for(int i=0;i<afterSorting.length;i++)
        {
            System.out.print(afterSorting[i]+ " ");
        }

        System.out.println();
        System.out.println("Third Largest Element: " + afterSorting[2]);
        */

    }
    
}
