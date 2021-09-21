package Abstractmethod;
abstract class Abclass{
    
    int i = 10;
    String name = "Ravali";
    int k = 'a';
       abstract void Ab();
       void Nmethod(){
           System.out.println("Normal method");}
         static void Smethod() {
System.out.println("Static method");    
           }
           final void Fmethod(){
               System.out.println("Final Method");
           }
        }
          class sub extends Abclass{
              void Ab(){
                 System.out.println("implementation of Abmethod");
             }
                
             }
            
            public class Robo{
                public static void main(String[]args){
                   sub ob = new sub();
                   ob.Ab();
                   ob.Fmethod();

                }
            }

         

    

