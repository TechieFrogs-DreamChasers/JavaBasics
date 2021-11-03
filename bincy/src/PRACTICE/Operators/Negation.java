package PRACTICE.Operators;
//negation(bitwise complement ~)(boolean not operator ! works only on boolean values)
public class Negation {
    public static void main(String[]  args){
        int i=5;
        System.out.println(~i);//0101->1010->-6(0110->1001+1->1010)2's complement of 6 or (-5-1)
        int b=-10;
        System.out.println(~b);//-(-10)-1=9or (01010 2's complement->10101+1->10110->1's complement->01001(9))
        System.out.println(!true);
    }
}
