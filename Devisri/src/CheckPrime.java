import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        //Checking if it's a prime number or not
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        int counter=0;
        int count=0;
        //entering a for loop to check the factors for the number by dividing it by i
        for (int i=1;i<=number;i++){
            double result=(double) number/i;
           // System.out.println(result+" "+Math.ceil(result));
            //Math.ceil rounds up decimals so every factor result changes except for number/1 and number/number
            if(result==Math.ceil(result)){
                counter++;
            }
        }
        //we will get only 2 perfect factors
        if(counter==2){
            System.out.println("Entered "+number+" is a Prime Number.");
        }else {
            System.out.println("Entered "+number+" is not a Prime Number.");
        }
        System.out.println("*********************");
        for(int j=2;j<=20;j++){
            for (int i=1;i<=j;i++){
                double result=(double) j/i;
                // System.out.println(result+" "+Math.ceil(result));
                if(result==Math.ceil(result)){
                    count++;
                }
            }
            if(count==2){
                System.out.println(j+" is a Prime Number.");
            }else {
                System.out.println(j+" is not a Prime Number.");
            }
            count=0;//so for every outer loop the count has to be reset
        }

    }
}

