package Arrays8;

import java.util.Arrays;

;public class SortAscending {
    public static void main(String[] args) {
        
        //char[] ch = new char[]{'c','b','a','q','v','d'}; 
        int[] in = new int[]{2,12,1,4,78,9,0};

        System.out.println();
        Arrays.sort(in);

        for(int i=0;i<in.length;i++)
        System.out.println("Sorting in Ascending Order "+ in[i]);
    }
    
}
