package Assignments.ClassesAndObjects;

public class Rectangle {
    int length;
    int breadth;

    int area(){
        int a=length*breadth;
        return a;
    }
    
    Rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }
    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle(4,5);
        Rectangle rectangle2=new Rectangle(5,8);
        System.out.println("Area of Rectangle1 is : "+ rectangle1.area()+" "+"Area of Rectangle1 is : "+ rectangle2.area());
        
    }


    
}
