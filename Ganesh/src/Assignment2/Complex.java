package Assignment2;

import java.util.Scanner;

public class Complex {
    double real_num,imag_num,sum;
    public void getData(Scanner sc){
        
     System.out.println("Enter Real Number : ");
     real_num = sc.nextDouble();
     System.out.println("Enter Imaginary Number :");
     imag_num= sc.nextDouble();
       
    }
   //addition
    public void sum(){
        Complex c1  = new Complex();
        Complex c2 = new Complex();
        System.out.println((c1.real_num+c2.real_num)+"+"+(c1.imag_num+c2.imag_num)+"i");
        
    }
   /* void display(){
        System.out.println("Sum of Complex numbers : "+sum );
    }*/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Complex s1 = new Complex();
        Complex s2 = new Complex();
        System.out.println("Enter complex number c1");
        s1.getData(sc);
        System.out.println("Enter Complex number c2 :");
        s2.getData(sc);
        s2.sum();
       // s2.display();
        sc.close(); 

    }
}