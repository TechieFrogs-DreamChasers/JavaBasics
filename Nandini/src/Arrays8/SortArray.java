package Arrays8;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        
        int n[] = {23,12,34,15,16,13,24};

        Arrays.sort(n);
        System.out.println("Sorted Ascending: "+ Arrays.toString(n));

        System.out.print("Sorted Descending: ");
        for(int i = n.length-1;i>=0;i--){
            System.out.print(n[i]+" ");
        }
    }
    
}
