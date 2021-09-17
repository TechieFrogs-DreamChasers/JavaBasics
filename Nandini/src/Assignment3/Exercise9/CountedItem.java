package Assignment3.Exercise9;

public class CountedItem extends PurchaseItem{
    
    private int quantity;

    CountedItem(int quantity){
        super("Chocolates",5);
        this.quantity = quantity;    
    }

    public int getQuantity(){
        return quantity;
    }

    @Override
    public double getPrice(){

        double p = super.getPrice();
        double total = p * quantity;
        return total;
    }
}
