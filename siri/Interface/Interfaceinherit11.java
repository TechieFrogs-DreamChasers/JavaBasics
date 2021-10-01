public interface Interfaceinherit11 {
    void print();

    
}
interface showable{
    void print();

}
class Testinhertence implements Interfaceinherit11,showable{

    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println("Hello All");
        
    }
    public static void main(String[] args) {
        Testinhertence oTestinhertence=new Testinhertence();
        oTestinhertence.print();
    }

}

