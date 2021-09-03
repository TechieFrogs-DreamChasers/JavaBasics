public class DoWhile {
    public static void main(String[] args) {
            int x=1;
            /*do{
                System.out.println(x);
                x++;
             }while (x<50);*/
            while(x<=5){
                for (int i=1;i<=10;i++){
                    if(i%2==0){
                        int j=i*x;
                        System.out.println(i+" X " + x + " = " +j);
                    }
                }
                x++;
            }
    }
}
