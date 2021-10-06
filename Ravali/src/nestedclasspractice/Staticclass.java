package nestedclasspractice;

public class Staticclass {
    static int i;
    private int j;
    int k;
    protected String name;
void displayout(){
    System.out.println("In display out");

}
staticStaticclass(){
    System.Out.println("In Constructor");//outer class constructor
    
}
static class Mystaticclass{
    private int l;
    int m;
    static int y;
    void displayNon(){
        System.out.println("Non static display method in inner class");
       
        

    }
static void display(){
    System.Out.println(" Static display method in inner class")
   



    
}
Mystaticclass(){
    System.Out.println("Static inner class constructor")
}
}
    public static void main(String[]args){

    }
}
