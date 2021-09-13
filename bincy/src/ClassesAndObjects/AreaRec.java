package ClassesAndObjects;

import java.util.Scanner;

public class AreaRec { //7.Area of a triangle
    int length;
    int breadth;

    int returnArea(){
        int area = length*breadth;
        return area;
    }

    public static void main(String[] args){
        System.out.println("Enter the length and breadth: ");
        Scanner obj = new Scanner(System.in);
        int len = obj.nextInt();
        int bre = obj.nextInt();
        obj.close();
        AreaRec area = new AreaRec(len, bre);
        System.out.println("Area: "+area.returnArea());
    }
    AreaRec(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
}
