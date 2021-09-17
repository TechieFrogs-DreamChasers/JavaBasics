public class programmer extends Employee {
    int k;
    String name;
    void Display(){
        System.out.println("programmer display");
        //super.display();
       //this.Display();in case useing this infinete
    }
    programmer(){
       // super();
       // super(100);
        //this();

    
        System.out.println("display programmer");
    }
    public static void main(String[] args) {
        programmer oP =new programmer();
        oP.Display();
        
    }
    
}
