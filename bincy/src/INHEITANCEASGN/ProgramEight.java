package INHEITANCEASGN;

public class ProgramEight {

}    
    class A{
        int i;
        int j;
        A(){
            i=3;
            j=6;

        }
        void display(){
            System.out.println(i+" "+j);
        }
    }
    class B extends A{
        int k;
        B(){
            k=6;
        }
        void show(){
            System.out.println(k);
        }
        public static void main(String []args){
            B b = new B();
            b.show();
        }
        
    }

    

