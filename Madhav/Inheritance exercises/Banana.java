public class Banana  {
    int no_of_items =10;
    void show()
    {
        System.out.println("No.of Bananas are "+no_of_items);
    }
    Banana()
    {
        show();
    }
}
class Apple extends Banana
{
    int no_of_items=5;
    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println("No.of Apples are "+apple.no_of_items);
        
    }
    
}



