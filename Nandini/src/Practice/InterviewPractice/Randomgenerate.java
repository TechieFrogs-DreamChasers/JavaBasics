package Practice.InterviewPractice;

import java.util.Random;

public class Randomgenerate {
    public static void main(String[] args) {
        
        Random rd = new Random();
        int value = rd.nextInt(50);
        System.out.println(value);

        long l = rd.nextLong(30);
        System.out.println(l);
    }
    
}
