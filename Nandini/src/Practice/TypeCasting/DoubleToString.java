package Practice.TypeCasting;

public class DoubleToString {
    public static void main(String[] args) {
        
        Double d = 2378.00;

        //String s = String.valueOf(d); //1st method

        String s = Double.toString(d); //2nd method

        System.out.println(s);
    }
    
}
