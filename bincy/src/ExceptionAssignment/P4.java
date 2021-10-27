package ExceptionAssignment;
import java.util.Scanner;

//throws keyword
public class P4 {
    public static void main(String[] args) throws Invalid{
        int age;
        System.out.println("Enter age ");
        Scanner obj = new Scanner(System.in);
        age = obj.nextInt();
        obj.close();
        if( age == 0)
         throw new Invalid("Invalid age");

        try{ 
            if(age>=60) {
                throw new Senior();
            }
        }catch(Senior se){
            System.out.println(se);
        }
        
        if(age>100) 
            throw new ArrayIndex("Age greater than 100");
        
    }
}
class Invalid extends InvalidInput{
    public Invalid(String msg){
        super(msg);
    }
    
}

class ArrayIndex extends ArrayIndexOutOfBoundsException{
    public ArrayIndex(String msg){
        super(msg);
    }
}

class Senior extends Exception{
    public Senior(){
        
    }
}
