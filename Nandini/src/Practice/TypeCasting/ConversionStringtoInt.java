package Practice.TypeCasting;

public class ConversionStringtoInt {
    public static void main(String[] args) {
        
        String s = "200";

        //Converting String to int using Integer.ParseInt()
        
        //int i = Integer.parseInt(s);

        int i = Integer.valueOf(s);

        System.out.println(i);
    }
    
}
