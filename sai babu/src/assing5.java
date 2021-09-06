import java.util.Scanner;

public class assing5 {
    public static void main(String[] args) {
        char alphabet;
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter the Alphabet");
        alphabet = scannerObj.next().charAt(0);

        if(alphabet=='a' || alphabet == 'e' ||alphabet == 'i' || alphabet == 'o' || alphabet == 'u')
            System.out.println("the alphabet is vovel");
        else
            System.out.println("the aplphabet is consonent");
        
    }
    
}
