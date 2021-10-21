package Practice.TypeCasting;

public class StringToChar {
    public static void main(String[] args) {
        
        String s = "string";

       // char c = s.charAt(2);

        //System.out.println(c);

        char[] ch = s.toCharArray();

        for(int i=0;i<ch.length;i++){
            System.out.println("Character at "+i+" position is "+ ch[i]);
        }
        
    }
    
}
