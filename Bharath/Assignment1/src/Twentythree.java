import java.util.Scanner;

public class Twentythree {
    public static void main(String[] args) {
        System.out.println("Enter the range: ");
        Scanner obj= new Scanner(System.in);
        int num= obj.nextInt();
        

        for(int i=1; i<=num; i++){
            int j, k, l;
            for(j=1; j<=num-i; j++)
                System.out.print("  ");
            for(k=i; k<=i+(i-1); k++){
                System.out.print(k+" ");
            }
            for( l=k-2; l>=i; l-- ){
                System.out.print(l+ " ");
            }
            System.out.println(" ");
        }

    }
    
}
