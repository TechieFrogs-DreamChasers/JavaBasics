class PrintNumber{
    public static void printn(int i){
        System.out.println("This is integer"); 
      System.out.println(i);
    }
    public static void printn(double d){
        System.out.println("This is double"); 
      System.out.println(d);
    }
    public static void printn(float f){
        System.out.println("This is Float"); 
      System.out.println(f);
    }
    public static void printn(long l){
        System.out.println("This is Long"); 
      System.out.println(l);
    }
    public static void printn(String s){
        System.out.println("This is String"); 
        System.out.println(s);
      }

    public static void main(String[] args) {
        printn(444.432f);
        printn(498765);
        printn(44L);
        printn(3.45678987);
        printn("Madhav");

    }
  }