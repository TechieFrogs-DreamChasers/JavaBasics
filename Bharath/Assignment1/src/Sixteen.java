import java.util.Scanner;

public class Sixteen {
    public static void main(String[] args) {
        Scanner arms=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = arms.nextInt();
        arms.close();
        int d = num;
        int r;
        int sum = 0;
        while(d!= 0){
            r= d%10;
            sum=((r)*(r)*(r))+sum;
            d=d/10;
        }
        if(num==sum)
            System.out.println(num+" is an Armstrong Number");
        else
            System.out.println(num+" is not an Armstrong Number");
    }
    
}
