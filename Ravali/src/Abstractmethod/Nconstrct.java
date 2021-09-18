package Abstractmethod;
class Print{
    int i,j,total;
  Print(){
      int i =10;
      int j= 20;
      System.out.println((i+j));
  } 
void display(){
    System.out.println("normal method");
}
}
public class Nconstrct {
    public static void main(String[]args){
Print ob= new Print();
//ob.display();
    }
    
}
