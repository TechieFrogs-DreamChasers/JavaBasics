package PRACTICE.Arrays;
//arrayCopy of System class
public class SystemCopy {
    public static void main(String[] args){
        int a[] ={1,2,3,4,5,6,7};
        int b[] = {4,5,6,7,8,9,10};
        System.arraycopy(a,0,b,0,4);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);

        }
        a[3] = 27;
        System.out.println(b[3]);
        b[3] = 30;
        System.out.println(a[3]);
    }
}
