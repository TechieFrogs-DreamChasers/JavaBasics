package Assignment3;


public class PurchaseItem {
   private String name;
   private double unitPrice;
    
   PurchaseItem(String name, double unitPrice){
       this.unitPrice  = unitPrice;
       this.name = name;
   }
   double getPrice(){
       return unitPrice;
   }

}

class WeightedItem {
    private double weight;
    
}

class CounterItem {
    private int quanity;
}
