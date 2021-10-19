package Practice.TypeCasting;

public class WideningTypeCating {
    public static void main(String[] args) {
        
        int x =7;

        //Automatically converts the integer to long
        long y = x;

        //Automatically converts the long to float
        float z = y;

        System.out.println("Before Conversion, int value "+x);
        System.out.println("After conversion, long value "+ y);
        System.out.println("After conversion, float value "+ z);
    }
    
}
