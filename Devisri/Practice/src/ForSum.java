public class ForSum {
    public static void main(String[] args) {
        int counter=0;
        for(int i=1;i<=100;i++){
            counter=i+counter;
        }
        System.out.println(" The sum of first 10 numbers is: "+counter);
    }
}
