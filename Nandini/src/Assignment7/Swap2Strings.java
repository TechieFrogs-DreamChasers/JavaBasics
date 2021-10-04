package Assignment7;

public class Swap2Strings {
    public static void main(String[] args) {
        
        int x=20,y=40;

        System.out.println("Brfore Swapping: "+ x +" "+  y);

        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println("After Swapping: "+ x +" "+  y);
    }
    
}
