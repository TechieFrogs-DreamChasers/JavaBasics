//Print duplicate elements in array
public class Program4 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 1, 2, 1, 2, 3, 7, 1, 3};
        int[] rep = new int[ints.length];
        int temp = 1;
        for (int i = 0; i < ints.length; i++) {
            temp = 0;
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[i] == ints[j]) {
                    temp++;
                }
            }
            if (temp == 1)
                System.out.println(ints[i]);
            temp = 0;
        }
    }
}
