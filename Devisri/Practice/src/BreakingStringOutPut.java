//This is about breaking a string in to 10 parts.
import java.util.Scanner;

public class BreakingStringOutPut {
    public static void main(String[] args) {
        //String data="This is about breaking a string in to 10 parts.";
        System.out.println("Enter a String: ");
        Scanner scanner=new Scanner(System.in);
        scanner.useDelimiter("[,]");
        while (scanner.hasNext()) {
            String token = scanner.next();
            System.out.println(token);
        }
        /*String token1=scanner.findInLine("This");
        String token2=scanner.findInLine("is");
        String token3=scanner.findInLine("about");
        String token4=scanner.findInLine("breaking");
        String token5=scanner.findInLine("a");
        String token6=scanner.findInLine("string");
        String token7=scanner.findInLine("in");
        String token8=scanner.findInLine("to");
        int token9 = Integer.parseInt(scanner.findInLine("10"));
        String token10=scanner.findInLine("parts.");*/

        /*System.out.println(token1);
        System.out.println(token2);
        System.out.println(token3);
        System.out.println(token4);
        System.out.println(token5);
        System.out.println(token6);
        System.out.println(token7);
        System.out.println(token8);
        System.out.println(token9);
        System.out.println(token10);
        System.out.println(token1+" "+token2+" "+token3+" "+token4+" "+token5+" "+token6+" "+token7+" "+token8+" "+token9+" "+token10); */
    }


}
