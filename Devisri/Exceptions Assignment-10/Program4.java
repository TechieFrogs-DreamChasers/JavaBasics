import java.util.Arrays;
import java.util.Scanner;
//Handle Exception using throws keyword
public class Program4 {
    public static void main(String[] args) throws WordException {
        String[] strings=new String[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<strings.length;i++){
            System.out.println("Enter a word: ");
            String s= sc.nextLine();
            if(s.length()>1 && (!s.matches("[0-9]+"))){
                strings[i]=s;
            } else {
                throw new WordException("WORD ATLEAST HAVE 2 LETTERS AND NOT NUMBERS");
            }
        }
        System.out.println(Arrays.toString(strings));
    }
}
class WordException extends Exception{
    public WordException(String message) {
        super(message);
    }
}
/*
Enter a word:
a
Exception in thread "main" WordException: WORD ATLEAST HAVE 2 LETTERS AND NOT NUMBERS
	at Program4.main(Program4.java:14)

Enter a word:
569
Exception in thread "main" WordException: WORD ATLEAST HAVE 2 LETTERS AND NOT NUMBERS
	at Program4.main(Program4.java:14)

Enter a word:
has
Enter a word:
have
Enter a word:
had
Enter a word:
are
Enter a word:
am
[has, have, had, are, am]
 */