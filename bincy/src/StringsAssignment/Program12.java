package StringsAssignment;
//Program to clear the StringBuffer
public class Program12 {
    public static void main(String[] args){
        StringBuffer obj = new StringBuffer();
        obj.append("Hi hello , How are you? ");
        System.out.println(obj);
        
        //StringBuffer delete method delete(int start, int end)
        obj.delete(0, obj.length());
        System.out.println(obj);
    }
    
}
