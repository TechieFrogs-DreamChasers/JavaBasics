import java.util.Scanner;

public class Averege {
    int a=0,b=0,c=0;
    public void caluculate(){
        int average=a+b+c/3;
        System.out.println("averege of "+ average);

    }
    public static void main(String[] args) {
        Averege oAverage=new Averege();
        
   
    Scanner oScanner=new Scanner(System.in);
    System.out.println("enter value");
    oAverage.a=oScanner.nextInt();
    System.out.println("enter value");
    oAverage.b=oScanner.nextInt();
    System.out.println("enter value");
    oAverage.c=oScanner.nextInt();
    oAverage.caluculate();
    oScanner.close();
    

}
    
}
