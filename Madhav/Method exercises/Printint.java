
  
  class J extends Printint{
    int j;
    public void printNum(){
      System.out.println(i);
      System.out.println(j);
    }
  }
  
  class Printint{

    int i;
   /* public void printNum(){
      System.out.println(i);
    } */
    public static void main(String[] args){
      J a = new J();
      a.i = 5;
      a.j = 7;
      a.printNum();
    }
  }