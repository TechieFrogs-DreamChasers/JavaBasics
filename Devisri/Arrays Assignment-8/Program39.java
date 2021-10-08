//Find Transpose of a matrix
public class Program39 {
    public static void main(String[] args) {
        int size = 5;
        int[][] numbers = new int[size][size];
        numbers[0] = new int[]{
                (int) ((Math.random() * 100) + 1),
                (int) ((Math.random() * 100) + 1),
                (int) ((Math.random() * 100) + 1),
                (int) ((Math.random() * 100) + 1),
                (int) ((Math.random() * 100) + 1)};
        numbers[1] = new int[]{
                (int) ((Math.random() * 100) + 1),
                (int) ((Math.random() * 100) + 1),
                (int) ((Math.random() * 100) + 1),
                (int) ((Math.random() * 100) + 1),
                (int) ((Math.random() * 100) + 1)};
        numbers[2] = new int[]{
                (int) ((Math.random() * 100) + 1),
                (int) ((Math.random() * 100) + 1),
                (int) ((Math.random() * 100) + 1),
                (int) ((Math.random() * 100) + 1),
                (int) ((Math.random() * 100) + 1)};
        numbers[3] = new int[]{
                (int) ((Math.random() * 100) + 1),
                (int) ((Math.random() * 100) + 1),
                (int) ((Math.random() * 100) + 1),
                (int) ((Math.random() * 100) + 1),
                (int) ((Math.random() * 100) + 1)};
        numbers[4] = new int[]{
                (int) ((Math.random() * 100) + 1),
                (int) ((Math.random() * 100) + 1),
                (int) ((Math.random() * 100) + 1),
                (int) ((Math.random() * 100) + 1),
                (int) ((Math.random() * 100) + 1)};
        System.out.println("Original Matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(numbers[j][i] + " ");
            }
            System.out.println();
        }
    }
}
/*
Original Matrix:
78 59 97 55 48
77 68 67 66 19
24 55 73 4 8
46 21 30 78 56
61 88 15 14 95
Transpose Matrix:
78 77 24 46 61
59 68 55 21 88
97 67 73 30 15
55 66 4 78 14
48 19 8 56 95
*/
