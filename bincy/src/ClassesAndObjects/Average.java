package ClassesAndObjects;

import java.util.Scanner;

public class Average {//8. Average of three numbers
    int num1,num2,num3;
    void average(){
        double avg = (num1+num2+num3)/3;
        System.out.println("Average : "+ avg);
    }
    public static void main(String[] args){
        int num1, num2, num3;
        System.out.println("Enter three numbers:  ");
        Scanner obj= new Scanner(System.in);
        num1 = obj.nextInt();
        num2 = obj.nextInt();
        num3 = obj.nextInt();
        obj.close();
        Average avgobj= new Average(num1,num2, num3);
        avgobj.average();
    }
    Average(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
}
