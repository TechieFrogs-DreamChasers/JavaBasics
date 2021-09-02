import java.util.*;
public class EvenNum {
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number");
        a = sc.nextInt();
        if(a % 2 == 0)
        {
            System.out.println(" The number is Even");
        }
        else{
            System.out.println("The number is not Even");
        }


    }
    
}
