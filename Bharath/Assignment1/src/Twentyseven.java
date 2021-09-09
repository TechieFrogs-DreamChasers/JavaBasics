

public class Twentyseven {
    public static void main(String[] args) {
        for(int i=1;i<8;i++) {
            for (int j = i; j <= 8; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=8;i>=1;i--){
            for(int j=i;j<=8;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
