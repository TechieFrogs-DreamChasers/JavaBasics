package ClassesAndObjects;

public class Rectangle {  // 5. Print area of Rectangle
    int length;
    int breadth;
    
    int area(){
        int a;
        a=length*breadth;
        return a;
    }

    public static void main(String[] args){
       Rectangle rec1 = new Rectangle(4,5);
       Rectangle rec2 = new Rectangle(5,8);
       System.out.println("Area1: "+rec1.area()+ " ,Area2: "+ rec2.area());
    }

    Rectangle(int l,int b){
        length = l;
        breadth = b;
    }
    
}
