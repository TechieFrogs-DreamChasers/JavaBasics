public class Ninth {
    public static void main(String[] args) {
        int num = 15, sum = 0;

        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);

        //while loop

        int num1 = 50, i = 1, sum1 = 0;

        while(i <= num1)
        {
            sum1 += i;
            i++;
        }
 
        System.out.println("Sum = " + sum1);

}
}