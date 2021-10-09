package Arrays8;

public class CopyArray {
    public static void main(String[] args) {
        
        String[] str = {"Java","Array","Program","Developer"};
        //System.out.println(str);

        String[] string = new String[2];
        
        System.arraycopy(str, 2, string, 0, 2); //we have to change the length of array if it is 2 for string then 2 for arraycopy length.

        for(String s:string)
        System.out.println(s);
    }
}
