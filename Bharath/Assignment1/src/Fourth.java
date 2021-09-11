import java.util.Scanner;
public class Fourth {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
    System.out.println("Enter the number");
    int i = num.nextInt();

    if(i %2==0){
        System.out.println("Even number= "+i);
    }else{
        System.out.println("Odd number="+i);
      
    }

    }
    
}
