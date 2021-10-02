package PRACTICE.Arrays;

public class AnonymousArray {
    public static void main(String[] args){
        printArray(new int[]{2,5,6,7,8});
    }

    public static void printArray(int []a){
        for(int i: a){
            System.out.println(i);
        }
    }
}
