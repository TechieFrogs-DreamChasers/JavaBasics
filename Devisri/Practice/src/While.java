public class While {
    public static void main(String[] args) {
        int i=1;
        while (i<=5){
            for (int j=5;j>=i;j--){
            System.out.print("*\t");
            }
            System.out.println();
            i++;
        }
    }
}
