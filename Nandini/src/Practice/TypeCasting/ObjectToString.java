package Practice.TypeCasting;

public class ObjectToString {
    public static void main(String[] args) {
        

        //Converting userDefined Class
        Emp e = new Emp();

        String s = e.toString();

        String s1 = String.valueOf(e);

        System.out.println(s);
        System.out.println(s1);


        //converting StringBuilder
        String s2 = "Hello";
        StringBuilder sb  = new StringBuilder(s2);
        
        String sbrev = sb.reverse().toString();

        System.out.println("String "+ s2);
        System.out.println("RevString "+ sbrev);
    }    
}

class Emp{ }
