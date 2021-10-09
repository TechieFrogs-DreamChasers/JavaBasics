package Practice.Arrays;

public class CopyingArray {
    public static void main(String[] args) {
      
        int[] in = {1,3,5,6,7,9};
        int copyto[] = new int[4];

        /*char[] ch = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',  
                'i', 'n', 'a', 't', 'e', 'd' };  

                char[] copyto = new char[9];*/

        System.arraycopy(in, 2, copyto, 0, 4);

        //System.out.println(String.valueOf(copyto));
        
        //for integer printing
        for(int i:copyto)
        System.out.println(i);

    }
    
}

//Copying an Array Syntax
/*public static void arraycopy(  
Object src, int srcPos,Object dest, int destPos, int length  
)*/ 