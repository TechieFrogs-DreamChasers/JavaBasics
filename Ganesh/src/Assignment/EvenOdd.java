package Assignment;

public class EvenOdd {
   /*public static void main(String[] args){
        //Checking for even or odd
        int a = 15;
        if (a%2 == 0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }*/
    public static void main(String[] args){
        int a = 15;
        //int r = a%2;
        switch(a%2){
            case 0 :
            System.out.println(a+ " = Number is even");
            break;
            default:
            System.out.println(a +" = Number is Odd");
        }
        
    }
}
