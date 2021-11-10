package PRACTICE.TypeCasting;
//Int to String conversion
public class IntToString {
    public static void main(String[] args){
        int num =40;
        String str = String.valueOf(num);
        System.out.println(str);
        String newString = "Hello how are you?";
        char ch[]= newString.toCharArray();
        str = String.valueOf(ch);
        System.out.println(str);
        str = String.copyValueOf(ch);
        System.out.println(str);
    }
}
