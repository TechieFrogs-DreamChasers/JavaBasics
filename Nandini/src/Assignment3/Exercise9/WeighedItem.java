package Assignment3.Exercise9;

public class WeighedItem extends PurchaseItem{

    private double weight;

    WeighedItem(double weight){

        super("Rice",100);
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    @Override
    public double getPrice(){
        double p = super.getPrice();
        double total = p * weight;
        return total;
    }

    
}
