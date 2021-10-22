package Practice.Exceptions.ThrowKeyword;

public class UserDefined{
    
    /*public UserDefined(String str) {
        super(str);
        //TODO Auto-generated constructor stub
    }*/

    public static void main(String[] args) {
        
        try{
                throw new UserDefinedException("This is user defined Exception ");

        }catch(UserDefinedException ude){
            System.out.println("Caught Exception");
            System.out.println(ude.getMessage());
        }
    }
    
}
