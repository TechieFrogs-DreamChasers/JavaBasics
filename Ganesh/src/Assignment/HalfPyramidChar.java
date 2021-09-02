package Assignment;

public class HalfPyramidChar {
    public static void main(String[] args){
        int height = 5;
        char ch = 'A';
        for(int i = 0;i<=height;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(ch);
            }
            ch++;
            System.out.println("");
        }
    }
}
