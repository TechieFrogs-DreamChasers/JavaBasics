public interface innerinterff {
    

    static interface innerf{
       
        static void innermethod(){
            System.out.println("static method");
        }
    }
    
}
class maddy implements innerinterff.innerf{

    public void innermethod()
    {
        System.out.println("inner method");
        
    }
    
    public static void main(String[] args) {
        maddy obj = new maddy();
        obj.innermethod();
        innerinterff.innerf.innermethod();
        
    }
}
