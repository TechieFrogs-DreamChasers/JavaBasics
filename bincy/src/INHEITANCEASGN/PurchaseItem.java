package INHEITANCEASGN;
public class PurchaseItem{
    private String name;
    private double unitPrice;

    PurchaseItem(String name,double unitPrice){
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }

    public String getName(){
        return name;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
}
class WeighedItem extends PurchaseItem{
    private double weight;
    WeighedItem(double weight){
        super("Onion",23);
        this.weight = weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }
}
class CountedItem extends PurchaseItem{
    private int quantity;
}