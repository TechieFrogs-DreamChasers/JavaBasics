package assign;
class p{
    void display(){
        System.out.println("This is a parent class");
    }



}

class c extends p{
    
    void displayout(){
        System.out.println("This is a child class ");
    }
}

public class Assign2 {
    public static void main (String[]args){
        parent obj = new parent();
        child obj1 = new child();
   obj.display();
obj1.displayout();

    }
    



    
}
