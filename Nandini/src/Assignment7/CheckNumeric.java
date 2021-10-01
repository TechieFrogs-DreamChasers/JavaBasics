package Assignment7;

public class CheckNumeric {

    static boolean checkNumericNumbers(String number){

        boolean isNumeric;
        String regex = "-?\\d+(\\.\\d+)?";
        if(number == null){
            isNumeric = false;
        }else if(number.matches(regex)){
            isNumeric = true;
        }else{
            isNumeric = false;
        }

        return isNumeric;

    }

    public static void main(String[] args) {
        
        String num = "1234";
        String num1 = "@467";
        String num2 = "3456-";
        String num3 = "1234";

        System.out.println("   ");
        System.out.println("String is Numeric or not: ");
        System.out.println("Number1: "+ checkNumericNumbers(num));
        System.out.println("Number2: "+ checkNumericNumbers(num1));
        System.out.println("Number3: "+ checkNumericNumbers(num2));
        System.out.println("Number4: "+ checkNumericNumbers(num3));

    }
    
}
