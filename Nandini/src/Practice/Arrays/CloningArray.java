package Practice.Arrays;

public class CloningArray {
    public static void main(String[] args) {
        
        int arr[] = {2,1,4,5};

        System.out.println("Before Cloning ");
        for (int i:arr)
        System.out.println(i);

        System.out.println("After cloning ");
        int[] cloning = arr.clone();

        for(int i:cloning)
        System.out.println(i);

        System.out.println("are they same");
        System.out.println(arr == cloning);


    }
    
}
