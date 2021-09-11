package Assignment2;

import java.util.Scanner;

public class Area {
    double length,breath,area,Parameter;
    public void setDim(){
        Scanner sc = new Scanner(System.in);
        length = sc.nextDouble();
        breath = sc.nextDouble();
        sc.close();
    }

    public double getArea(){
        area = length * breath;
        return area;
    }
    void display(){
        System.out.println("Area of Rectagle : "+ area);
    }
    public static void main(String[] args){
        Area r = new Area();
        r.setDim();
        r.getArea();
        r.display();

    }
    

    
}
