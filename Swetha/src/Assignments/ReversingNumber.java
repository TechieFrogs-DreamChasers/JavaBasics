package Assignments;

public class ReversingNumber {
    public static void main(String[] args){
        int no=987654321,reverse=0;
        while(no!=0){
        int dig=no%10;
        reverse=reverse*10+dig;
        no/=10;
        }
        System.out.println("Reversed Number: " + reverse);
        }
    
}
