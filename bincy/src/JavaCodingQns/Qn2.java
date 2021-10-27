package JavaCodingQns;

import java.util.Scanner;

//Moving zeros to the begining or end
public class Qn2 {
    public static void main(String[] args){
        System.out.println("Enter 10 elements");
        Scanner obj = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        for(int i=0;i<a.length;i++){
            a[i]= obj.nextInt();
        }
        obj.close();
        int c=0,j=0;
        for(int i=0;i<a.length;i++){
            if(a[i] == 0){
                c++;
            }
            else{
                b[j]= a[i];
                j++;
            }
        }
        for(int i=0;i<c;i++){
            b[j] = 0;
            j++;
        }
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
    
}
