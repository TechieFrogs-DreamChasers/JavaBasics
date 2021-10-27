package ExceptionAssignment;
//Handle exception with overloaded methods
public class P8 {
  public static void main(String[]args  ){
      sum(3,5);
      sum(3,7);
      sum('a','c');

  }
  static void sum(int a,int b) {
      int sum = a+b;
      System.out.println(sum);
      if(sum>10){
        throw new Arithmetic("Sum greter than 5");
      }  
  }
 
static void sum(int a,double b){
      double sum =a+b;
      System.out.println(sum);
      if(sum>=10){
          throw new Arithmetic("Sum greter than or equal to 10");
      }
  }
  static void sum(char a,char b){
      int sum = a+b;
      System.out.println(sum);
      if(sum>10){
          throw new Arithmetic("Sum greter than 10");
      }
  }
  
}
class  Arithmetic extends ArithmeticException{
    Arithmetic(String msg){
        super(msg);
    }
}
