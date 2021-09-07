package Assignment2;

import java.util.Scanner;

public class RectangleArea {
    double length,breath,area;
    public RectangleArea(double l,double b){
        Scanner sc =new Scanner(System.in);
        l = sc.nextDouble();
        b = sc.nextDouble();
        this.length = l;
        this.breath = b;
        
        sc.close();

    }
    public double returnArea(){
        area = length*breath;
        return area;
    }
    public static void main(String[] args){
        RectangleArea RA = new RectangleArea(0,0);
        RA.returnArea();
        System.out.println("Area of Rectangle : "+RA.area);
    }
    }
