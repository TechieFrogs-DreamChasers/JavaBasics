class Rectangle{
    int length;
    int breadth;
    public Rectangle(int l, int b){
      length = l;
      breadth = b;
    }
    public int Area(){
      return length*breadth;
    }
    public int Perimeter(){
      return 2*(length+breadth);
    }
  }
  
class Sol{
    public static void main(String[] args){
      Rectangle a = new Rectangle(4,5);
      Rectangle b = new Rectangle(5,8);
      System.out.println("Area : "+a.Area()+" \nPerimeter is "+a.Perimeter());
      System.out.println("Area : "+b.Area()+" \nPerimeter is "+b.Perimeter());
    }
  }
    