package ArraysAssignment;

import java.util.Scanner;

//Print odd and even numbers
public class Progrm20 {
    public static void main(String[] args){
        int num[] = new int[10];
        System.out.println("Enter 10 elements:  ");
        Scanner obj =new Scanner(System.in);
        for (int i=0;i<num.length;i++){
            num[i] = obj.nextInt();
        }
        obj.close();

        int even[] = new int[num.length];
        int odd[]= new int[num.length];
        int j=0,k=0;
        for(int i=0;i<num.length;i++){
            if(num[i]%2 == 0)
                even[j++] =num[i];
            else
                odd[k++] = num[i];

        }
        int evenlen = j;
        int oddlen =k;
        System.out.print("Even numbers: ");
        for(j=0;j<evenlen;j++){
            System.out.print(even[j]+" ");
        }
        System.out.println();
        System.out.print("Odd numbers: ");
        for(k=0;k<oddlen;k++){
            System.out.print(odd[k]+" ");
        }
        
    }
    
    
    
}
