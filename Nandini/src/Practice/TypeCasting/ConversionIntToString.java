package Practice.TypeCasting;

public class ConversionIntToString {
    public static void main(String[] args) {
        
        int i = 200;

        //Converting integer to string
        
        //String s = String.valueOf(i); //method-1

        //String s = Integer.toString(i); //method-2

        String s = String.format("%d",i); //method-3

        System.out.println(i+100); //300

        System.out.println(s+100); //200100
    }
    
}
