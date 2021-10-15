package ExceptionAssignment;
//Multiple ArrayOutOfBound, Not reachable
public class P11 {
    public static void main(String[] args){
        try{
            int a[] =new int[10];
            a[11] =30;
        }catch(ArrayIndexOutOfBoundsException ie){
            System.out.println("Array index Out of bound");
        }/*catch(ArrayIndexOutOfBoundsException ie){
            System.out.println("Array index out of bound");
        }*/
        try{
            display();
        }catch( ArithmeticException ae){
            System.out.println("arithmetic");
        }
    } 
    static void display() throws ArithmeticException{
        int num;
        num = 30/0;
        System.out.println(num);
        throw new ArithmeticException();
    }

    
}
