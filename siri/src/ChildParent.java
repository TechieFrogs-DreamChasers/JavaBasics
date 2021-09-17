public class ChildParent extends ParentChild {
    void display(){
        System.out.println("childparent class");
    }
    ChildParent(){
        System.out.println("child class");
    }
    public static void main(String[] args) {
        
    ChildParent oc=new ChildParent();
    oc.display();
    oc.Parentdisplay();
    ParentChild op =new ParentChild();
    op.Parentdisplay();
    }
    
}
