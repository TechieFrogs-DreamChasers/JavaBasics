import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        Average av=new Average();
        av.average(num1,num2,num3);
    }
    void average(int a,int b,int c){
        double average=(double) (a+b+c)/3;
        System.out.println("The average of entered numbers is: "+average);
    }
}
