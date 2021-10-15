package ExceptionAssignment;
//class not found exception
public class P12 {
    public static void main(String[] args) throws ClassNotFoundException{
        
            NotFound notFound = new NotFound();
            //throw new ClassNotFoundException("Class not found");
        //}catch(ClassNotFoundException ex){
            System.out.println("Not found");
        
    }
}
class NotFound{
    void display(){
        System.out.println("Not found");
    }
}
