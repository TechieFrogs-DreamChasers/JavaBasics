import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number= scanner.nextInt();
        scanner.close();
        int digit=number;//assuming digit is 153
        int rem;
        int sum=0;
        while(digit!=0){
            rem=digit%10;//rem=153%10=1//15%10=5//1%10=1
            sum=((rem)*(rem)*(rem))+sum;//sum=3*3*3+0=27//5*5*5+27=152//1*1*1+152=153
            digit=digit/10;//digit=153/10=15//15/10=1//1/10=0
        }
        if(number==sum)
            System.out.println(number+" is an Armstrong Number");
        else
            System.out.println(number+" is not an Armstrong Number");
    }
}
