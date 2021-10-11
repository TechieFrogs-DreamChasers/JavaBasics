public interface Inherinterface {
    void print();

    
}
 interface showablee extends Inherinterface{
     void show();


}
class testintinhe implements showablee{

    @Override
    public void print() {
        System.out.println("Hello");
        
    }

    @Override
    public void show() {
        System.out.println("World");
        
    }
    public static void main(String[] args) {
        testintinhe oTestintinhe =new testintinhe();
        oTestintinhe.print();
        oTestintinhe.show();
    }

}
