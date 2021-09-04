import java.util.Scanner;


public class Alphabet {
  public static void main(String[] args) {
      Scanner scannerObj=new Scanner(System.in);
System.out.println("enter the alphabet:");
String s=scannerObj.next();
char ch=s.charAt(0);

if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
{
    System.out.println("vowel");
}
else
System.out.println("consonent");


      scannerObj.close();
  }  
}
