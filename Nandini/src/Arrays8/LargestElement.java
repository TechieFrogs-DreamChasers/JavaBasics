package Arrays8;

public class LargestElement {
    public static void main(String[] args) {
        
        int values[] = {12,20,18,25,19};

        int max = values[0];
        
        for(int i=0;i<values.length;i++){
            if(values[i]>max){
                max = values[i];
            }
        }

        System.out.println("Largest Element Present in Given Array: "+max);
    }
    
}
