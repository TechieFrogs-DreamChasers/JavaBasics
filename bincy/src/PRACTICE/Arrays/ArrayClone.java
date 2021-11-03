package PRACTICE.Arrays;
//Array clonning
public class ArrayClone {
    public static void main(String[] args){
        int a[] = {1,2,3,4,5,6};
        int b[];
        b = a.clone();
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        a[3] = 9;
        System.out.println();
        System.out.println(a[3]+" "+ b[3]);
        b[4] = 16;
        System.out.println(a[4]+" "+ b[4]);
        
    }
}
