package Assignment7;

public class SeparateIndiChar {
    public static void main(String[] args) {
        String str = "Hello JavaProgrammer";

        char[] str1 = str.toCharArray();

        for(int i=0;i<str.length();i++){
            System.out.print(str1[i] + " ");
        }
    }
    
}
