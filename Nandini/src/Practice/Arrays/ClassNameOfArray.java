package Practice.Arrays;

public class ClassNameOfArray {

    public static void main(String[] args) {
        
        //int a[] = new int[]{3,2,4};
        String array[] = new String[]{"Hi","Hello","Java"};

        Class c = array.getClass();
        String name = c.getName();
        System.out.println(name);
    }
    
}
