public class counter {

    int i;
     void increment()
     {
         System.out.println(i);
     }
    
}
class child extends counter
{
    public static void main(String[] args) {
        child ch = new child();
        ch.i = 3;
        ch.increment();
    }
}
