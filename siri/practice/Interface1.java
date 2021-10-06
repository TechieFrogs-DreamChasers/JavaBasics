public interface Interface1 {
      int i =10;
      void myinterfacedisplay();
}
class interface2{
    public void myinterfacedisplay(){
        System.out.println("my interfacedisplay");
    }
}
class interface3 extends interface2 implements Interface1{

}
class mainclass{
    public static void main(String[] args) {
        Interface1 a=new interface3();
        a.myinterfacedisplay();
    }
}
