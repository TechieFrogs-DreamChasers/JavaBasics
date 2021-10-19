package Practice.Exceptions;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        
        //Multi Catch Block
        /*try{
             int a[] = {2,4,6,8,9};
             a[5] = 20/0;
        }
         catch(ArithmeticException e){
             System.out.println("Arithmetic Exception Occurs");
         }
         catch(ArrayIndexOutOfBoundsException e){
             System.out.println("Array Index Out of bound Exception Occurs");
         }
         catch(Exception e){
             System.out.println("Parent Exception Occurs ");
         }
         System.out.println("Rest Of the Code ");*/



         //Muti Catch Block 2
         /*try{
            int a[] = {2,4,6,8,9};
            System.out.println(a[10]);
       }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Occurs");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of bound Exception Occurs");
        }
        catch(Exception e){
            System.out.println("Parent Exception Occurs ");
        }
        System.out.println("Rest Of the Code ");*/



        //Try Block Contains 2 Exceptions but only one exception occurs and its corresponding catch block is executed
        try{
            int a[] = {2,4,6,8,9};
            a[5] = 20/0;
            System.out.println(a[10]);
       }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Occurs");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of bound Exception Occurs");
        }
        catch(Exception e){
            System.out.println("Parent Exception Occurs ");
        }
        System.out.println("Rest Of the Code ");



        //we generate NullPointerException, but didn't provide the corresponding exception type. 
        //In such case, the catch block containing the parent exception class Exception will invoked.
        /*try{
            String s=null;
            System.out.println(s.length()); 
       }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Occurs");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of bound Exception Occurs");
        }
        catch(Exception e){
            System.out.println("Parent Exception Occurs ");
        }
        System.out.println("Rest Of the Code ");*/


        //Without Maintaining the order of the exception
        /*try{
            int a[]=new int[5];    
            a[5]=30/0;  
       }
        catch(Exception e){
            System.out.println("Common task completed ");
        }
        catch(ArithmeticException e){
            System.out.println("task1 completed");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("task2 completed");
        }*/



        //
        
        

    }
    
}
