import java.util.Scanner;
interface RegularPolygon {
    int getNumSides();
    double getSideLength();
  
    static int totalSide(RegularPolygon[] rpArray) 
    
  
    default double getPerimeter() {
    }
    default double getInteriorAngle() {
    }
  }
  
  class EquilateralTriangle implements RegularPolygon {
    private double sideLength;
  
    public EquilateralTriangle(double sideLength) {
    }
  
    public int getNumSides() {
    }
  
    public double getSideLength() {
    }
  
    public String toString() {
    }
  }
  
  class Square implements RegularPolygon {
    private double sideLength;
  
    public Square(double sideLength) {
    }
  
    public int getNumSides() {
    }
  
    public double getSideLength() {
    }
  
    public String toString() {
    }
  }
  
  public class Main {
    public static void main(String[] args) {
      Scanner con = new Scanner(System.in);
      int n = con.nextInt();
      RegularPolygon[] rpArray = new RegularPolygon[n];
      con.close();
    }
  }
