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
   /* public void sum(){
        Complex c1  = new Complex();
        Complex c2 = new Complex();
        System.out.println((c1.real_num+c2.real_num)+"+"+(c1.imag_num+c2.imag_num)+"i");
        
    }*/
   /*void display(s1.getData(sc),s2.getData(sc)){
    System.out.println((s1.real_num+s2.real_num)+"+"+(s1.imag_num+s2.imag_num)+"i");
   }*/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Complex s1 = new Complex();
        Complex s2 = new Complex();
      //  Complex dis = new Complex();
        System.out.println("Enter complex number c1");
        s1.getData(sc);
        System.out.println("Enter Complex number c2 :");
        s2.getData(sc);
        System.out.println((s1.real_num+s2.real_num)+"+"+(s1.imag_num+s2.imag_num)+"i");
      //  s2.sum();
       // dis.display();
        sc.close(); 

    }
}