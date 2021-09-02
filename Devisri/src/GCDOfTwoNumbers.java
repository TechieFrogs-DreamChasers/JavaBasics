import java.util.Scanner;

public class GCDOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int number1=scanner.nextInt();
        System.out.println("Enter the Second number: ");
        int number2=scanner.nextInt();
        scanner.close();
        int gcd=0;
        if(number1==0||number2==0){
            System.out.println("Gcd of "+number1+" and "+number2+" is "+gcd);
        } else{
            if(number1<number2){
                for(int i=number1;i>0;i--){
                    if((number1%i==0) && (number2%i==0)){
                        System.out.println("Gcd of "+number1+" and "+number2+" is "+i);
                        break;
                    }
                }
            }
            else if(number1>number2){
                for(int i=number2;i>0;i--){
                    if((number1%i==0) && (number2%i==0)){
                        System.out.println("Gcd of "+number1+" and "+number2+" is "+i);
                        break;
                    }
                }
            }
            else {
                System.out.println("Gcd of "+number1+" and "+number2+" is "+number1);
            }
        }

    }
}
