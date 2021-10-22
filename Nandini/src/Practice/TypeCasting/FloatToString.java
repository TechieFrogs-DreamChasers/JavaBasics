package Practice.TypeCasting;

public class FloatToString {
    public static void main(String[] args) {
        
        Float f = 3678.00f;

        //String s = String.valueOf(f); //one method

        String s = Float.toString(f); //two method

        System.out.println(s);
    }
    
}
