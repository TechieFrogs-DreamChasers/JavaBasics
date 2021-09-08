package Assignment2;

import java.util.Scanner;

public class Complex {
    double real_num,imag_num,sum;
    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Real Number : ");
     real_num = sc.nextDouble();
     System.out.println("Enter Imaginary Number :");
     imag_num= sc.nextDouble();
    sc.close();    
    }
   //addition
    public double sum(getData c1, double imag_num){
        Complex c1  = new Complex();
        Complex c2 = new Complex();
        double sum = ((c1.real_num+c2.real_num)+(c1.imag_num+c2.imag_num));
        return sum;
    }
    void display(){
        System.out.println("Sum of Complex numbers : "+sum );
    }
    public static void main(String[] args){
        Complex s1 = new Complex();
        System.out.println("Enter complex number c1");
        c1 = s.getData();
        System.out.println("Enter Complex number c2 :");
        c2 = s.getData();
        s.sum(0,0);
        s.display();


    }
}
