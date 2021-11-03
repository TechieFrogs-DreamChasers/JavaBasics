package PRACTICE.Arrays;

import java.util.Arrays;

//copyOf method
public class ArrayCopy {
    public static void main(String[] args){
        int a[] = {1,2,3,4,5,6};
        int b[];
        b = Arrays.copyOf(a,a.length);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        a[3] = 9;
        System.out.println(a[3]+" "+b[3]);

    }
    
}
