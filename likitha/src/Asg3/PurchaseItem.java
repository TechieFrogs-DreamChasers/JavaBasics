package src.Asg3;

public class PurchaseItem {
    private String name;
    private Double unitPrice;
    PurchaseItem(String n,double u){
       this.name=n;
        this.unitPrice=u;

    }
    double getPrice()
    {
        
        System.out.println(name);
        return unitPrice;
    }
}
class WeighedItem extends PurchaseItem{
private double weight;
WeighedItem()
{
    super("liki", 10);
}
double getPrice()
{
    return weight;
}
}
class CountedItem extends PurchaseItem{
private double qty;
CountedItem()
{
    super("sneha", 20);
}
double getPrice()
{
  
    System.out.println(qty);
    return qty;
}
}
//application class
class Challenge{
    public static void main(String[] args) {
    WeighedItem o1=new WeighedItem();
    CountedItem o2=new CountedItem();
    o1.getPrice();
    o2.getPrice();

    //Challenge c=new Challenge();
    }

}


