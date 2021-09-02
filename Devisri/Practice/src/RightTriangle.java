public class RightTriangle {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {
            for (int j = 5; j >= i; j--) {
                if(j<i){
                    System.out.print("");
                }else{
                System.out.print("* \t");
                }
            }
            System.out.println();
        }
    }
}

