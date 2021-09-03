public class PracticeFor {
    public static void main(String[] args) {
        loop1: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2)
                    continue loop1;
                System.out.println("i= " + i + " " + "j= " + j);

            }
            break loop1;
        }
    }
}
