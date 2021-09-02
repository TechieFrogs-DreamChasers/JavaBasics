import java.util.Scanner;

/*
Use the keyboard to enter three numbers, and then display the middle number.
In other words, not the largest and not the smallest.
If all the numbers are equal, display any one of them.
Requirements:
•	The program should read the numbers from the keyboard.
•	The program must display a number on the screen.
•	The program should display the middle number of the three numbers.
•	If all the numbers are equal, display any one of them.
•	If two of the three numbers are equal, display either of the two. 5 7 10
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        //int max=0;
        //int min=0;
        int mid=0;

        if(a-b>a-c){
            mid=a;
        } else if(b-c>b-a){
            mid=b;
        }else if(c-a>c-b){
            mid=c;
        }
        System.out.println(mid);


    }
}
