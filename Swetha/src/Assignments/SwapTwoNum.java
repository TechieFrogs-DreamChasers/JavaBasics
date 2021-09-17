package Assignments;

public class SwapTwoNum {
    public static void main(String[] args) {
        int n1=30,n2=20;
        System.out.println("Before Swap:");
        System.out.println(n1);
        System.out.println(n2);
        
    n1=n1-n2;
    n2=n1+n2;
    n1=n2-n1;

    System.out.println("After Swap:");
    System.out.println(n1);
    System.out.println(n2);
}
    
}
