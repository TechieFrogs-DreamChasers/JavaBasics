package PRACTICE;

public class StringDemo {
   
    public static void main(String[]  args){
        String s = "Hello";
        char ch[] = {'H','o','l','a'};
        String s1 = new String(ch);
        String str = new String();
        System.out.println(str+ " "+ s1+ " "+s);
       
        str.concat("GoodMorning");
        System.out.println(str+ " without assigning");
        
        str = str.concat("Goodevening");
        System.out.println( str+ " After assignment");

        boolean eq = str.equals(s1);
        System.out.println(eq);

        s1 = "goodevening";
        boolean eq1 = str.equals(s1) ;
        System.out.println(eq1);
        eq1 = str.equalsIgnoreCase(s1);
        System.out.println(eq1);
        eq1 = str.contentEquals("eve");
        System.out.println(eq1);
        
    }
    
}
