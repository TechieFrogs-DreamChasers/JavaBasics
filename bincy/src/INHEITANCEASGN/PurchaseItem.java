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

    public double getPrice(){
       double price = (super.getUnitPrice() * weight);
       return price;
    }
}
class CountedItem extends PurchaseItem{
    private int quantity;

    CountedItem(int quantity){
        super("Pen",2);
        this.quantity = quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        double price = (super.getUnitPrice() * quantity);
        return price;
    }
}
class Challenge{
    public static void main(String[] args){
        System.out.println("")
               WeighedItem weigh = new WeighedItem(weight)
    }
}