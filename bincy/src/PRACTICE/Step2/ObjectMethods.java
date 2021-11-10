package PRACTICE.Step2;

public class ObjectMethods {
    
}
class Customer{
    int cusID;
    String name;
    public int getCusID() {
        return cusID;
    }
    public void setCusID(int cusID) {
        this.cusID = cusID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args){
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        c1.setCusID(1);
        c1.setName("John");
        c2.setCusID(2);
        c2.setName("Smith");

        System.out.println(c1.getCusID());
        System.out.println(c1.getName());
        System.out.println(c2.getCusID());
        System.out.println(c2.getName());

        System.out.println(c1);//PRACTICE.Step2.Customer@4617c264
        show(c1);
        show(c2);
        boolean b = c1.equals(c2);
        System.out.println(b);
 
     }
     //overriding toString()
     public String toString(Customer obj){
         return obj.cusID+" "+obj.name;
     }
     //overriding equals 
     public boolean equals(Object obj){
        Customer c = (Customer)obj;
        if(this.cusID == c.cusID && this.name.equals(c.name))
            return true;
        else
            return false;
     }
    
     static void show(Customer obj){
         System.out.println(obj.getClass());//fully qualified name -- class package.classname
         System.out.println(obj.getClass().getName());//only package.classname
         System.out.println(obj.hashCode());//numeric value of reference in memory
         System.out.println(obj.toString());//getclass().getname()+@+Inyteger.toHexString(hashcode())
 
     }
   
}
