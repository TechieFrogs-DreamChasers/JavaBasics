package INHEITANCEASGN;

public class Rectangle {
    int length;
    int breadth;

    void area(){
        int area = length * breadth;
        System.out.println("Area: "+ area);
    }
    void perimeter(){
        int peri = 2*(length+breadth);
        System.out.println("Perimeter: "+ peri);
    }
    Rectangle(int l,int b){
        this.length = l;
        this.breadth = b;
    }
}
