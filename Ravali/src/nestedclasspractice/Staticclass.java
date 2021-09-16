package nestedclasspractice;

public class Staticclass {
    static int i;
   // private int j;
    int k;
    protected String name;
void displayout(){
    System.out.println("In display out");

}
Staticclass(){
    System.out.println("In Constructor");//outer class constructor

}
static class Mystaticclass{
    //private int l;
    int m;
    static int y;
    void displayNon(){
        System.out.println("Non static display method in inner class");   
    }
static void display(){
    System.out.println(" Static display method in inner class");   
}
public static void main(String[]args){
   // Staticclass outerobj = new Staticclass();
   



}

    
}
 
    public static void main(String[]args){
        Staticclass.Mystaticclass innerobj = new Staticclass.Mystaticclass();
        innerobj.displayNon();
        Mystaticclass.display();//static method of inner class

    }
}
