package Assignment3;

public class Apple {
    int number_of_items = 45 ;

}
class Banana extends Apple{
    int number_of_items = 123;
    Banana(){
        System.out.println("Constructor of class Banana");
    }
    void show(){
        System.out.println("Apple Class Number of items :"+super.number_of_items+"  \nNumber of items in class Banana :"+number_of_items);
    }

    public static void main(String[] args){
        Banana objB = new Banana();
        objB.show();
    }
}
