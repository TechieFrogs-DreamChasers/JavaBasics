package Practice.TypeCasting;

public class LongToString {
    public static void main(String[] args) {
        
        Long l =  467890l;

        //String s = String.valueOf(l); //one Method

        String s = Long.toString(l); //second Method
        
        System.out.println(s);
    }
    
}
