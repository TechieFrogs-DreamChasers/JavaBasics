package PRACTICE.Arrays;

import java.util.Arrays;

//sorting
public class ArraysSort {
    public static void main(String[] args)
    {
        int[] a = new int[]{45, 12, 78, 34, 89, 21};
         
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
         
        System.out.println(Arrays.toString(a));
         
        //Output : [12, 21, 34, 45, 78, 89]
    }
}
/*Arrays.toString(a)-->Returns a string representation of the contents of the specified array. 
The string representation consists of a list of the array’s elements, enclosed in square brackets (“[]”). Adjacent elements are separated by the characters “, ” (a comma followed by a space).
 Returns “null” if a is null.*/