package Step2;

public class ArrayElements {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6};
        int element = 3;
        boolean flag = false;
        for(int i=0;i<a.length;i++)
        {                                       /*Finding Array Elements*/
            if(a[i]==element)
            {
                flag=true;
                break;
            }
                else
                {
                    flag = false;
                }
            
        }
        if(flag)  //or if(flag==true)
        {
            System.out.println("Element Exists");
        }
        else{
            System.out.println("Element doesn't exist");
        }
        
    }
    
}
