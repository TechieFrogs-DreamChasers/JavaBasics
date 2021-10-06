package Assignments.ClassesAndObjects;

import java.util.Scanner;

public class Area {
    Scanner sc=new Scanner(System.in);
    int lenght=sc.nextInt();
    int breadth=sc.nextInt();
    public static void main(String[] args) {
        Area a=new Area();
        a.setDim(a.lenght,a.breadth); 
        a.getArea();       
    }
    void setDim(int length,int breadth){
       this.lenght=length;
        this.breadth=breadth;      
     }
     void getArea(){
         double area=lenght * breadth;
         System.out.println("The Area of Rectangle is: "+area);
        }
    


    
}
