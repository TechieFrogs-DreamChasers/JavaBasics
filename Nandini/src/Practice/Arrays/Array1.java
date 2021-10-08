package Practice.Arrays;


//Array is an Object of dynamically generated class
//java array inherits the Object class
//and implements the serializable as well as clonable interfaces
//java provides the feature of anonymous arrays

public class Array1 {
    public static void main(String[] args) {
        
        int a[] = new int[3];
        a[0] = 12;
        a[1] = 3;
        a[2] = 2;

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
    
}
