package PRACTICE.Exception;

public class EXceptionDemo {
    public static void main(String[] args){
        int a=5;
        int b=0;
        try{
        System.out.println(a/b);
        }catch(ArithmeticException ex){
            System.out.println("Handling exception");

        }
        String s = "";
        System.out.println(s+1);
        if(s!=null){
            System.out.println("null");
        }
        try{
        System.out.println(s.charAt(0));
        }catch(StringIndexOutOfBoundsException ex){
            System.out.println("String outof bound");
            //ex.printStackTrace();
        }
        //int k;
        
        //k = Integer.parseInt(s);
        try{
        System.out.println(s.charAt(4)); 
        }catch(StringIndexOutOfBoundsException ex){
            System.out.println("Handling exception");
            //ex.printStackTrace();
        }
        

        
        int num[]= {1,2,3,4};
        try{
        System.out.println(num[5]);//ArrayIndexOutOfBoundException
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Handling");
        }

    }
}
