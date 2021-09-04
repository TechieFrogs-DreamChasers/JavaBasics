class printCharNint{
    public static void printn(int i,char c){
         
      System.out.println("integer "+i+" Charecter "+c);
    }
    public static void printn(char c,int i){
         
        System.out.println("Charecter "+c+" Integer "+i);
    }
    

    public static void main(String[] args) {
        printn('n', 23);
        printn(44, 'r');

    }
  }