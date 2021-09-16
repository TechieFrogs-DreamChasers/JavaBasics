/*
4.Create a class named 'Rectangle' with two data members 'length' and 'breadth' 
and two methods to print the area and perimeter of the rectangle respectively.
 Its constructor having parameters for length and breadth is used to initialize
  length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' 
  class with its constructor having a parameter for its side (suppose s) calling the
 constructor of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and a square. */
package INHEITANCEASGN;

import java.util.Scanner;

public class Square extends Rectangle{
    //int side;
    Square(int side){
        super(side, side);

       // this.side = side;
    }
    public static void main(String[] args){
        System.out.print("Enter side of square: ");
        Scanner obj =new Scanner(System.in);
        int s = obj.nextInt();
        System.out.println("Enter length and breadth: ");
        int l = obj.nextInt();
        int b = obj.nextInt();
        obj.close();
        Square sq = new Square(s);
        sq.area();
        sq.perimeter();
        Rectangle rec = new Rectangle(l, b);
        System.out.print("Rectangle Area : " );
         rec.area() ;
         System.out.print( "Perimeter :");
         rec.perimeter();
        
    }
    
}
