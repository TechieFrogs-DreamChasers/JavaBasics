package Practice.Arrays;

public class ReturningArray {
    public static void main(String[] args) {
        
        String[] array = returnarray();

        for(int i=0;i<array.length;i++) { 
            System.out.println(array[i]);  
        }
    }

    static String[] returnarray(){

        return new String[]{"array","Element","Value"};
    }
    
}
