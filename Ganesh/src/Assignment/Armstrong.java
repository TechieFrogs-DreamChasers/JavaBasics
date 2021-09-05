package Assignment;
import java.util.Scanner;

public class Armstrong {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive interger");

    int arm = sc.nextInt();
    int temp = arm;
    int rem = 0;
    int k = 0;
    while(arm != 0){
        rem = arm % 10;
        k = k + (rem*rem*rem);
        arm = arm/10;               
    }
    System.out.println(k);
    System.out.println("value : "+temp);
        if (k == temp){
            System.out.println("Number is Armstrong :"+temp+ " = "+k);
        }
        else {
            System.out.println("Number is Not Armstrong : "+temp+" :/: "+k);
        }
        sc.close();
    }
  
    
}

