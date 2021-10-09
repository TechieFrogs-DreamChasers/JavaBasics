public interface Interfaceinher{
    void inheriteprint();

}
interface Showable{
    void show();

}
class testinher implements Interfaceinher,Showable{
    public void inheriteprint(){
        System.out.println("hello");
    }
    public void show(){
        System.out.println("java");
    }
    public static void main(String[] args) {
    testinher oTestinher=new testinher();
    oTestinher.inheriteprint();
    oTestinher.show();


        }
   // @Override
    //public void inheriteprint() {
        // TODO Auto-generated method stub
        
    
    }

    

