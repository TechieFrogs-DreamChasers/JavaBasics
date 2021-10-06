package Assignment3.Exercise9;

public class PurchaseItem {
    
    private String name;
    private double unitPrice;

    PurchaseItem(String name,double unitPrice){
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public double getPrice(){
        return unitPrice;
    }

    public void setPrice(double price){
        this.unitPrice = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
