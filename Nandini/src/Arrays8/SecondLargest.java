package Arrays8;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        
        int[] in = {12,89,34,7,0,28,4,18};

        System.out.println("Before Sorting "+ Arrays.toString(in));

        Arrays.sort(in);

        int afterSorting[] = new int[in.length];

        //Assigning values of in to aftersorting
        System.out.println();
        for(int i=0;i<in.length;i++){
            afterSorting[in.length-i-1] = in[i];
        }

        System.out.println("After Sorting "+ Arrays.toString(afterSorting));

        System.out.println();
        System.out.println("Third Largest Element: " + afterSorting[1]);
        

    }
    
}
