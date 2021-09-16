package ClassesAndObjects;

import java.util.Scanner;

public class Area { //6.Print area of rectangle
    int length,breadth;
   
    void setDim(){
        System.out.println("Enter the length and breadth: ");
        Scanner obj = new Scanner(System.in);
        length = obj.nextInt();
        breadth = obj.nextInt();
        obj.close();
    }
   
    int getArea(){
        int a;
        a = length * breadth;
        return a;
    }

    public static void main(String[] args){
        
       // System.out.println("Enter the length and breadth: ");
        //Scanner obj = new Scanner(System.in);
        //length = obj.nextInt();
        //breadth = obj.nextInt();
        Area area = new Area();
       // area.setDim();
        System.out.println("Area of the triangle: "+area.getArea());
    }
    Area(){
        setDim();
    }
    
}
