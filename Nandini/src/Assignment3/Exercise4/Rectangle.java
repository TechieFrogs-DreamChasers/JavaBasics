package Assignment3.Exercise4;

public class Rectangle {

        double length;
        double breadth;

        Rectangle(double length,double breadth){
            this.length = length;
            this.breadth = breadth;
        }

        void area(){

            double area = length * breadth;
            System.out.println("Area of Rectangle: " + area);

        }

        void perimeter(){

            double perimeter = (2 * (length*breadth));
            System.out.println("Perimeter Of Rectangle: "+ perimeter);

        }
    
}
