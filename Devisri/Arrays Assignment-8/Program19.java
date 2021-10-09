import java.util.Arrays;
import java.util.Scanner;

//Remove Duplicates from an Array
public class Program19 {
    public static void main(String[] args) {
        System.out.println("Enter the Length: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        sc.nextLine();
        sc.close();
        int[] ints = new int[length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("Elements are: " + Arrays.toString(ints));
        Arrays.sort(ints);
        //storing temp to first value of this sorted array
        int temp=ints[0];
        //setting a flag/duplicate value to false
        boolean duplicate=false;
        //traversing to loop
        for(int i=0;i<ints.length;i++){
            //if temp=ints[0]=flag is set to true
            //first value gets printed
            if(temp == ints[i]){
                duplicate=true;
            }
            //if temp value is not equal to next value element gets printed
            //if its equal then this loop is not executed
            else if(temp!=ints[i]){
                System.out.println(" "+temp);
                temp=ints[i];
                duplicate=false;
            }
        }
        System.out.println(" "+temp);
    }
}
/*
Enter the Length:
10
Elements are: [6, 91, 75, 47, 71, 99, 69, 78, 89, 76]
 6
 47
 69
 71
 75
 76
 78
 89
 91
 99

Enter the Length:
10
Elements are: [68, 74, 40, 32, 39, 20, 94, 13, 40, 60]
 13
 20
 32
 39
 40
 60
 68
 74
 94
 */
