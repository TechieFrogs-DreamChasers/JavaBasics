import java.util.Arrays;

//Handling Multiple Exceptions ArrayOutOfBounds
public class Program11 {
    public static void main(String[] args) {
        String[] cus_Name = {"Mary", "Jean", "Noel", "Ginni", "Adam"};
        long[] cus_Acc_Num = {10001L, 20002L, 30003L, 40004L, 50005L};
        double[] cus_Balance = {1000, 8000, 6000, 4000, 2000};
        try {
            System.out.println(Arrays.toString(cus_Name));
            for (int i = 0; i <= 5; i++) {
                System.out.println("Name: " + "\t" + cus_Name[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(Arrays.toString(cus_Acc_Num));
            for (int i = 0; i <= 5; i++) {
                System.out.println("Name: " + "\t" + cus_Acc_Num[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(Arrays.toString(cus_Balance));
            for (int i = 0; i <= 5; i++) {
                System.out.println("Name: " + "\t" + cus_Balance[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
/*
[Mary, Jean, Noel, Ginni, Adam]
Name: 	Mary
Name: 	Jean
Name: 	Noel
Name: 	Ginni
Name: 	Adam
Index 5 out of bounds for length 5
[10001, 20002, 30003, 40004, 50005]
Name: 	10001
Name: 	20002
Name: 	30003
Name: 	40004
Name: 	50005
Index 5 out of bounds for length 5
[1000.0, 8000.0, 6000.0, 4000.0, 2000.0]
Name: 	1000.0
Name: 	8000.0
Name: 	6000.0
Name: 	4000.0
Name: 	2000.0
Index 5 out of bounds for length 5
 */