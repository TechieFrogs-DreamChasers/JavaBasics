package Arrays8;

import java.util.Arrays;

public class SortDescending {
    public static void main(String[] args) {
        
        //int[] in = {2,1,6,5,3,8,0,6};
        char[] ch = {'d','a','z','h','e'};

        Arrays.sort(ch);

        for(int i = ch.length-1;i>=0;i--){
            System.out.println("Sorting in Descending Order "+ ch[i]);
        }
    }
    
}
