//Program of Conversion of Decimal Value to Binary, Octal & HexDecimal

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        sc.nextLine();
        convertDecimalToBinary(number);
        convertDecimalToHexDecimal(number);
        convertDecimalToOctal(number);
        sc.close();
    }
    static void convertDecimalToBinary(int num){
        String binary=Integer.toBinaryString(num);
        System.out.println("Decimal number "+num+" to Binary: "+binary);
    }
    static void convertDecimalToOctal(int num){
        String octal=Integer.toOctalString(num);
        System.out.println("Decimal number "+num+" to Octal: "+octal);
    }
    static void convertDecimalToHexDecimal(int num){
        String hex=Integer.toHexString(num);
        System.out.println("Decimal number "+num+" to HexDecimal: "+hex);
    }
}
/*
Enter a number:
50236
Decimal number 50236 to Binary: 1100010000111100
Decimal number 50236 to HexDecimal: c43c
Decimal number 50236 to Octal: 142074
 */