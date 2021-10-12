public interface Interfaceex1{
    void print();

}
class A11 implements Interfaceex1{
     public void print(){
        System.out.println("print classA1");
    }
}
class A2 implements Interfaceex1{
    
       public void print(){
            System.out.println("print classA2");

        }
    }
        class A3{
        public static void main(String[] args) {
            Interfaceex1 oInterfaceex1=new A2();
            oInterfaceex1.print();
    
        }
    
}
    

