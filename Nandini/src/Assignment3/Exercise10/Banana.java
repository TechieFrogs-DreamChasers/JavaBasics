package Assignment3.Exercise10;

public class Banana extends Apple{
        
    int number_of_items;

    Banana(int number_of_items){
        super(15);
        this.number_of_items = number_of_items;
    }

    void show(){

        super.show();
        System.out.println("Number of Bananas: "+ number_of_items);
        
    }
}
