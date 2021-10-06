package assign;
class Father{
    private int PV ;
    int i=10;
    Father(int propertyvalue){
        this.PV =  propertyvalue;
    }
    public int getPV(){
        return this.PV;
   }



  
}
class child1 extends Father
{
    private int child1property;
    child1(int propertyvalue , int child1property)
    {
        super(propertyvalue);
        this.child1property = child1property;
    }
    
    int gettotalchild1property()
    {
        return (getPV()/2) + this.child1property;
    }

}
    class child2 extends Father{
        int child2property;
        child2(int propertyvalue, int child2property){
            super(propertyvalue);
            this.child2property=child2property;
        }
        
        int gettotalchild2propertyvalue(){
            return this.getPV()/2 + this.child2property;
        }
    }

    class child3 extends Father{
        int child3property;
        child3(int propertyvalue, int child3property){
        super(propertyvalue);
        this.child3property= child3property;

    }
   
    int gettotalchild3propertyvalue(){
        return this.getPV()/2 + child3property;
    }


public class Hiee{
    public static void main(String[]args){
        child1 obj2 = new child1(100, 50);
        System.out.println(obj2.getPV());
        
        
        System.out.println(obj2.gettotalchild1property());

       child2 obj3 = new child2 (100, 20);
        
       System.out.println(obj3.gettotalchild2propertyvalue());

        child3 obj4 = new child3 (100, 10);

        
        System.out.println(obj4.gettotalchild3propertyvalue()); 
       

    }
}
}


