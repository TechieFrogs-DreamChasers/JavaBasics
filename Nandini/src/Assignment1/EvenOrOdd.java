<<<<<<< HEAD
=======
package Assignment1;
>>>>>>> 4925dc6a6839deb37f9dc0a89ebbec9612ad9f4c
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner number = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int givenNumber = number.nextInt();
		number.close();
		
		if((givenNumber%2) == 0)
		{
			System.out.println( givenNumber +" "+ "is EvenNumber");
		}else
		{
			System.out.println(givenNumber +" "+ "is OddNumber");
		}
		
		
	}

}
