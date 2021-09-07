import java.util.Scanner;

class PurchaseItem
{
    private String name;
    private int unitPrice;
    int price;
    PurchaseItem(String x,int s,int q)
    {
        name = x;
        unitPrice = s;
        price = (int)(unitPrice*q);
        
    }
    int getPrice()
    {
        return this.price;
    }
   

}
class weightedItem extends PurchaseItem
{
    private static int weight=5;
    
    weightedItem(String s,int u)
    {
        super(s, u,weight);
        System.out.println("the price of "+s+" which have weight "+weight+" is "+super.getPrice());
    }
   
}
class countedItem extends PurchaseItem
{
    private static int quantity=10;
  
    countedItem(String s,int u)
    {
        super(s,u,quantity);
        System.out.println("the price of "+s+" which have quantity "+quantity+" is "+super.getPrice());
    }
   
    

}

public class challenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of item");
        String name = sc.nextLine();
        System.out.println("Enter unit price of item");
        int up = sc.nextInt();
        countedItem cItem = new countedItem(name,up);
        //cItem.display();
        weightedItem wItem = new weightedItem(name,up);
       // wItem.display();


    }
    
}
