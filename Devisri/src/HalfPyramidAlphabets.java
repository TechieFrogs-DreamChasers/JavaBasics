import java.util.Scanner;

public class HalfPyramidAlphabets {
    public static void main(String[] args) {
        loop1: for(char i='A';i<='E';i++){
            loop2: for (char j='A';j<=i;j++){
                loop3:for (int k=j;k>=j;k--){
                    System.out.print((char) k+" ");
                }
                System.out.print("");
            }
            System.out.println();
        }
    }
}
