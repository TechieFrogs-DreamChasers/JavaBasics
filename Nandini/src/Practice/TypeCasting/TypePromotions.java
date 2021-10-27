package Practice.TypeCasting;

public class TypePromotions {
    public static void main(String[] args) {
        
        //promotes each byte,short,char operand into int when evaluating an expression.
        //if one operand is long,float,double it will be promoted to long,float,double respectively.

        byte b = 20;
        char c = 'A';
        short s = 10;
        int i = 100;
        long l = 1000;
        float f = 5.55f;
        double d = .12;

        double result = (l*b)+(l/c)-(d*s);

        System.out.println("Result: "+ result);
    }
    
}
