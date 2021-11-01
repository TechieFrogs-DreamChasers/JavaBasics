package Practice.InterviewPractice;


//Adding first and second numbers and third number answer.
public class Fibonaci {

        static int firstNumber = 2;
        static int secondNumber = 3;
        static int fibonaciNumber;
        

    public static void main(String[] args) {
        
        int count = 10;
        System.out.println(firstNumber);
        System.out.println(secondNumber);

        fibonaciNumber(count-2);

        
    }

    public static void fibonaciNumber(int count){
        
        if(count>0){

            fibonaciNumber = firstNumber+secondNumber;
            System.out.println(fibonaciNumber);

            firstNumber = secondNumber;
            secondNumber = fibonaciNumber;
            fibonaciNumber(count-1);
        }
    }
}
