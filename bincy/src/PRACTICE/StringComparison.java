package PRACTICE;

public class StringComparison {
    public static void main(String[] args){
        String first = "Good Morning";
        String second = "Hood Morning Bin";
        /*Boolean eq = first.equals(second);
        System.out.println(eq);
//equals()
        second = "Good Morning";
        eq = first.equals(second);// compares original content of the string
        System.out.println(eq);

        second = "good Morning";
        eq = first.equals(second);
        System.out.println(eq);
        eq = first.equalsIgnoreCase(second);//ignore cases and compare content
        System.out.println(eq);
// == operator
        String third = "Good Morning";
        if (first == third){   //first and third refenced to same location in string const pool
            System.out.println(" first and third equal");
        }    
        else{
            System.out.println("first and third Not equal");
        } 
        
        String fourth = new String("Good Morning");
        if (first == fourth){
            System.out.println("first and fourth equal");
        }
        else{
            System.out.println("first and fourth not equal");// since new string creates object in heap
        }*/
// copareTo()        
        int i = first.compareTo(second);
        System.out.println(i);
        i = second.compareTo(first);
        System.out.println(i);
        
        System.out.println(first.compareTo(first));

    }
}
