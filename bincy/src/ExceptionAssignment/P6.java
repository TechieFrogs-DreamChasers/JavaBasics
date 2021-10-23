package ExceptionAssignment;
//Nested try statements
public class P6 {
    public static void main(String[] args){
        String name = "John";
        try{
            System.out.println(name.charAt(2));
            try{
                System.out.println(name.charAt(6));
                try{
                    System.out.println(name.charAt(7));
                }catch(StringIndexOutOfBoundsException ex){
                    System.out.println(ex.getMessage());
                }
            }catch(StringIndexOutOfBoundsException ex){
                System.out.println(ex.getMessage());
            }
        }catch(StringIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
    }
}
