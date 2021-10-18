package Practice.Exceptions;

public class NestedTryBlock {
    public static void main(String[] args) {
        
        //Where we place a try block within another try block for 2 diff exceptions
        /*try{

            //inner try block 1
            try{

                int data = 30/0;
            }catch(ArithmeticException e){
                System.out.println(e);
            }


            //inner try block 2
            try{
                int[] array = new int[5];
                array[5] = 10;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }

            System.out.println("This is for the Main Try block ");

        }catch(Exception e){
            System.out.println("Main handled the Exception(Outre Catch)");
        }
        System.out.println("Normal flow");*/



        //Here the try block within nested try block (inner try block 2) do not handle the exception. 
        //The control is then transferred to its parent try block (inner try block 1). 
        //If it does not handle the exception, then the control is transferred to the main try block (outer try block) 
        //where the appropriate catch block handles the exception. It is termed as nesting.
        try{

            //inner try block 1
            try{
                //inner try block 2
                try{
                    int[] array = new int[5];
                    array[5] = 10;
                }
                    catch(ArithmeticException e1){
                    System.out.println(e1);
                    System.out.println("inner try block 2");
                }
            }
            catch(ArithmeticException e2){
                System.out.println(e2);
                System.out.println("inner try block 1");
            }
            
        }catch(ArrayIndexOutOfBoundsException e3){
            System.out.println(e3);
            System.out.println("This is for the Main Try block Outer(main)");

            

        }catch(Exception e){
            System.out.println("Main handled the Exception outer(main)");
        }
        System.out.println("Normal flow");
    }
    
}
