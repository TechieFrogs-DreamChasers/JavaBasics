<<<<<<< HEAD
=======
package Assignment1;
>>>>>>> 4925dc6a6839deb37f9dc0a89ebbec9612ad9f4c
import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner number = new Scanner(System.in);
		System.out.println("Enter Number1: ");
		int number1 = number.nextInt();
		System.out.println("Enter Number2: ");
		int number2 = number.nextInt();
		number.close();
		
		//Swapping two numbers
		int temp;
		temp = number1;
		number1 = number2;
		number2 = temp;
		
		System.out.println("First number after swapping = " + number1);
		System.out.println("Second number after swapping = " + number2);
		
		

	}

}
