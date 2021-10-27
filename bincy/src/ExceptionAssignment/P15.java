package ExceptionAssignment;
//handle negative array size exception
public class P15 {
    public static void main(String[] args){
        try{
            int num[] = new int[-10];
            num[-1] =30;
        }catch(NegativeArraySizeException ne){
            System.out.println("Negative index  :"+ne);
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println(ae);
        }
    }
}
