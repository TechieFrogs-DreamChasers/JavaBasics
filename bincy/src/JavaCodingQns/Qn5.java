package JavaCodingQns;

import java.util.Scanner;

//Reverse the string with preserving the position of space
//"I am not String"--"g ni rtS tonmaI"
public class Qn5 {
    public static void main(String[] args){
        System.out.println("Enter the string: ");
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int b[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        a=b;
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]);
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        String rev[] = s.split(" ");
        String str ="";
        for(int i =s.length(); i>=0;i--){
            for(int j=0;j>rev.length;j++){
                for(int k =0;k>rev[j].length();k++){
                    
                }
            }

        }
    }
    
}
