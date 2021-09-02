public class PracticeNestedIf {
    public static final String MSG1="Temperature is Very cool";
    public static final String MSG2="AC IS NOT WORKING";

    public static void main(String[] args) {
        int acTemp=23;
        if(acTemp<18){
            System.out.println(MSG1);
        }else if(acTemp>18){
            if(acTemp>=18 & acTemp<=24){
                System.out.println("Temperature is cool");
            }else if(acTemp>24 & acTemp<28){
                System.out.println("Temperature is Moderately cool");
            }else{
                System.out.println("Temperature is at bottom level");
            }
        } else{
            System.out.println(MSG2);
        }
    }
}
