package Assignment2;

//import java.util.Scanner;

public class Complex {

    int img;
    int real;

    public Complex(int img,int real){
        this.img = img;
        this.real = real;
    }

    public void ShowComplexNumbers(){
        //System.out.println("Complex Numbers: ");
        System.out.println(img + "   " + real);
    }
    public static void main(String[] args) {
        
        Complex c1 = new Complex(6,10);
        Complex c2 = new Complex(7,12);

        System.out.println("First Complex Number: ");
        c1.ShowComplexNumbers();

        System.out.println("Second Complex Number: ");
        c2.ShowComplexNumbers();

        System.out.println("Addition of Complex Numbers: ");
        Complex addition = sum(c1,c2);
        addition.ShowComplexNumbers();

        System.out.println("Substraction of Complex Numbers: ");
        Complex substraction = difference(c1,c2);
        substraction.ShowComplexNumbers();

        System.out.println("Multiplication of Complex Numbers: ");
        Complex multiplication = multiply(c1,c2);
        multiplication.ShowComplexNumbers();

    }

    static Complex sum(Complex num1,Complex num2){

        Complex num = new Complex(0,0);

        num.img = num1.img+num2.img;
        num.real = num1.real+num2.real;

        return num;
    }

    static Complex difference(Complex num1,Complex num2)
    {
        Complex num = new Complex(0,0);
        num.img = num1.img-num2.img;
        num.real = num1.real-num2.real;
        return num;
    }

    static Complex multiply(Complex num1,Complex num2)
    {
        Complex num = new Complex(0,0);
        num.img = num1.img*num2.img;
        num.real = num1.real*num2.real;
        return num;
    }
}
