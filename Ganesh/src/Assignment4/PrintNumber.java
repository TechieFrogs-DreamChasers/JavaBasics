package Assignment4;

public class PrintNumber {
    
    void printn(byte a, byte b){
        System.out.println("Sum of Byte dataType :"+(a+b));
    }
    void printn(int a , int b){
        System.out.println("Sum of Integer dataType :"+(a+b));
    }
    void printn(long a, long b){
        System.out.println("Sum of Long dataType :"+(a+b));
    }
    void printn(float a, float b){
        System.out.println("Sum of Float dataType :"+(a+b));
    }
    void printn(double a, double b){
        System.out.println("Sum of Double dataType :"+(a+b));
    }
    void printn(char a,char b){
        System.out.println("Sum of Char dataType :"+(a+b));
    }
    void printn(String a,String b){
        System.out.println("Sum of String dataType :"+(a+b));

    }

    public static void main(String[] args){
        PrintNumber Obj = new PrintNumber();
        Obj.printn(5,6);
        Obj.printn(12,32);
        Obj.printn(2134,8795);
        Obj.printn(215.2f,352.32f);
        Obj.printn(132.321d,6542.25d);
        Obj.printn('F','a');
        Obj.printn("Ganesh","Krishna");
    }
}

