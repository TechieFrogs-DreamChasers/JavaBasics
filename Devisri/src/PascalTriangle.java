public class PascalTriangle
{
    public static void main(String[] args) {
       int p=1;
        for(int i=1;i<5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            p=1;
            for(int k=0;k<=i;k++){
                System.out.print(p +" ");
                p = p * (i-k)/(k+1);
            }
            System.out.println();
        }

    }
}
