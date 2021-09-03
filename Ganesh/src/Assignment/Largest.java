package Assignment;

public class Largest {
    public static void main(String[] args){
        int a = 20;
        int b = 100;
        int c = 15;

        if(a >= b && a >= c){
            System.out.println(a+" is the Largest");
        }
        else if(b >= c){
            System.out.println(b+" is the Largest");
        }
        else{
            System.out.println(c+" is the largest");
        }
    }
    
}
