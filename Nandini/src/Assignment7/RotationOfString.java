package Assignment7;

public class RotationOfString {

    public static void main(String[] args) {
        
        String string1 = "JavaProgrammer";
        String string2 = "ProgrammerJava";

        String string3 = string1+string1;

        System.out.println("Check if one String is rotation of another String: ");

        if(string1.length() == string2.length())
        {
            boolean string4 = string3.contains(string2);
            if(string4){

                System.out.println("String is having rotation");
            }
            else{
                System.out.println("String is not rotating");
            }
        }

    }
    
}
