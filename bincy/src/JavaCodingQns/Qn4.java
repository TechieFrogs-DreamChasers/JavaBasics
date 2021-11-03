package JavaCodingQns;

import java.util.Scanner;

//leaders in an array{14,9,11,8,6,7,5} --{14,11,8,7,5} are leaders
//if all the elements in the right is less than the number
public class Qn4 {
    public static void main(String[] args){
        int num[] =new int[10];
        int leaders[] = new int[10];
        System.out.println("Enter 10 elements");
        Scanner obj = new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            num[i] = obj.nextInt();
        }
        obj.close();
        int k = 0;
        
        for(int j=0;j<num.length;j++){
            boolean flag =true;
            for(int i =j+1;i<num.length;i++){
                if(num[j]<num[i]){
                    flag = false;
                    break;
                }
                
            }
            if(flag == true){
                leaders[k++] = num[j];
            }
        }
        System.out.println("Leaders: ");
        for(int i = 0;i<k;i++){
            System.out.print(leaders[i] + " ");
        }
    }
    
}
