import java.util.Scanner;

//swap two string variables without using third variable
public class Program44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //reads two strings
        System.out.println("Enter first String:");
        String s1 = sc.nextLine();
        System.out.println("Enter first String:");
        String s2 = sc.nextLine();
        sc.close();
        //printing before swap
        System.out.println("Before Swap: " + s1);
        System.out.println("Before Swap: " + s2);
        //swapFirst returns the first string parameter which is stored in s1
        //so s2=s1
        //then s1=s2
        s1 = swapFirst(s2, s2 = s1);
        System.out.println("After Swap: " + s1);
        System.out.println("After Swap: " + s2);
    }

    //method for swapping
    static String swapFirst(String s1, String s2) {
        return s1;
    }
}
/*
Enter first String:
Red berries are Red Color
Enter first String:
Blue berries are Blue Color
Before Swap: Red berries are Red Color
Before Swap: Blue berries are Blue Color
After Swap: Blue berries are Blue Color
After Swap: Red berries are Red Color
 */
