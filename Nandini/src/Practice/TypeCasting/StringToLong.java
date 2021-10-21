package Practice.TypeCasting;

public class StringToLong {
    public static void main(String[] args) {
        
        String s = "288900";

        Long l = Long.parseLong(s);

        System.out.println(l);
    }
    
}

//If we give double value 230.00 it will give NumberformatException.