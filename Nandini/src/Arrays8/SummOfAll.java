package Arrays8;

public class SummOfAll {
    public static void main(String[] args) {
        
        int[] n = {2,1,5,8,9,6};
        int total = 0;

        for(int i=0;i<n.length;i++){
            total += n[i];
        }

        System.out.println("Total Of All Elements: "+ total);
    }
    
}
