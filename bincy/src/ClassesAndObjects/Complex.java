package ClassesAndObjects;

import java.util.Scanner;

public class Complex {  //9.Complex number addition,substraction,multiplication
    int real1,real2;
    int img1,img2;
    
    void add(){
        int sumRl,sumImg;
        sumRl = (real1+real2);
        sumImg = img1 + img2;
        System.out.println("Sum = "+sumRl+ "+"+sumImg+"j");
    }

    void difference(){
        int difRl, difImg;
        difRl = real1-real2;
        difImg = img1 - img2;
        System.out.println("Difference = "+difRl+ "+"+ difImg+"j");
    }

    void product(){
        int pdtRl,pdtImg;
        pdtRl = real1 * real2;
        pdtImg = img1 * img2;
        System.out.println("Product= "+ pdtRl+ " +"+pdtImg + "j");
        
    }

    public static void main(String[] args){
        System.out.println("Enter two complex numbers:");
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the real part of first: ");
        int real1 = obj.nextInt();
        System.out.println("Enter the imaginary of first : ");
        int img1 =obj.nextInt();
        System.out.println("Enter the real part of second: ");
        int real2 = obj.nextInt();
        System.out.println("Enter the imaginary of second : ");
        int img2 = obj.nextInt();
        obj.close();
        Complex comp = new Complex(real1,img1,real2,img2);
        comp.add();
        comp.difference();
        comp.product();
    }

    Complex(int real1, int img1,int real2,int img2){
        this.real1 = real1;
        this.img1 = img1;
        this.real2 = real2;
        this.img2 = img2;

    }
    
}
