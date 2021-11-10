package PRACTICE.Arrays;

import java.util.Arrays;

//Arrays.deepEquals(object1,object2)
public class ArrayDeepEquals {
    public static void main(String[] args){
        int num1[] = new int[]{1,2,3,4,5,5,6,77,6};
        int num2[] = new int []{1,2,3,4,5,6,78};
        System.out.println(Arrays.equals(num1, num2));
        int a[][] = {{10,20},
                        {30,40},
                    {50,60}};
        int b[][] = {{10,20},{30,40},{50,60}};
        System.out.println(Arrays.deepEquals(a,b));
        System.out.println(Arrays.equals(a, b));
    }
    
}
