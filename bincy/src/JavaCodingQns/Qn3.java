package JavaCodingQns;

import java.util.Scanner;

//Number conversion dec-bin,dec-oct,dec-hex
public class Qn3 {
    public static void main(String[] args){
        System.out.println("enter a decimal number");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        obj.close();
        int bin[] = new int[10];
        int oct[] = new int[10];
        
        int temp = num;

        String s = Integer.toBinaryString(num);
        System.out.println("Binary: "+s);
        s = Integer.toHexString(num);
        System.out.println("Hex: "+s.toUpperCase());
        s = Integer.toOctalString(num);
        System.out.println("Oct: "+s);

        int k =0;
        if(num == 0 || num == 1){
            System.out.println("Binary of "+num +" is "+ num);
        }
        else{
            while(num>0){
                bin[k++] = num%2;
                num = num/2;
            }
        }
        System.out.print("Binary: ");
        for(int i = k-1;i>=0;i--)
            System.out.print( bin[i]);
        System.out.println();
        num = temp;
        k = 0;
        while(num>0){
            oct[k++] = num%8;
            num = num/8;
        }
        System.out.print("Octal : ");
        for(int i = k-1; i>=0;i--){
            System.out.print(oct[i]);
        }
        System.out.println();

        num = temp;
        String hexchars[] = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        String hex = "";
        while(num>0){
            int r =num%16;
            hex = hexchars[r] + hex;

            num = num/16;
           
        }
        System.out.print("Hex : "+ hex);
        
        
    }
}
