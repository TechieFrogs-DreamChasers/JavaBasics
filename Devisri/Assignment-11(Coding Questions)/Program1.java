import java.util.ArrayList;

//Find intersection or common elements between arrays.
public class Program1 {
    public static void main(String[] args) {
        //taking two char arrays to check for common elements
        char[] letters = {'1', 'i', 'n', 'o', 'U', 'b', 'A', '*', '-', 'p'};
        char[] chars = {'2', '1', 'i', 'o', 'a', '*', 'B', 'c', 'g', 'p'};
        //took an ArrayList to add the common elements
        ArrayList<Character> list = new ArrayList<>();
        //traversing through for loop to check every value between letters & chars array
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters.length; j++) {
                if (letters[i] == chars[j]) {
                    //if element values are equal then, adding those values to ArrayList
                    list.add(letters[i]);
                    //System.out.println(letters[i]);
                }
            }
        }
        //Printing the common elements between arrays using ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
