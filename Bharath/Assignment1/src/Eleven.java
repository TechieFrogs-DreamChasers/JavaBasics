import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        int i;
        System.out.println("Enter two numbers: ");
        Scanner obj = new Scanner(System.in);
        int num1= obj.nextInt();
        int num2= obj.nextInt();
        obj.close();

        if(num1<num2)
            i=num1;
        else
            i=num2;
        int hcf=1;
        for(int j=1; j<=i; j++){
            int r1 = num1%j;
            int r2 = num2%j;
            if(r1==0 && r2==0){
                hcf=j;
            }

        }
        System.out.println("HCF of "+num1+" and "+ num2+" is "+hcf);


    }
    
}
