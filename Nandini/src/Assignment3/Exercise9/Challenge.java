package Assignment3.Exercise9;

public class Challenge {
    public static void main(String[] args) {
        WeighedItem weight = new WeighedItem(20);
        CountedItem count = new CountedItem(10);

        System.out.println("The Price of "+ weight.getWeight() +" kg "+ weight.getName() + " is " +" $"+weight.getPrice());
        
        System.out.println("The Price Of "+ count.getQuantity() + " " +count.getName() + " is " +" $"+count.getPrice());
        
        
    }
}
