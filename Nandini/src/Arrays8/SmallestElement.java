package Arrays8;

public class SmallestElement {
    public static void main(String[] args) {
        
        int n[] = {21,0,19,26,3,90};

        int min = n[0];

        for(int i=0;i<n.length;i++){
            if(n[i]<min){
                min = n[i];
            }
        }

        System.out.println("Smallest Element in an Array: "+ min);
    }
    
}
