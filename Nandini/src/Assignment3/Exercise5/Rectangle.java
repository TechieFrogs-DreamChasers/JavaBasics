package Assignment3.Exercise5;

public class Rectangle {

        double length;
        double breadth;

        Rectangle(double length,double breadth){
            this.length = length;
            this.breadth = breadth;
        }

        public double getArea(){
            return area();
        }
        public double area(){

            double area = length * breadth;
            System.out.println("Area of Rectangle: " + area);
            return area;

        }

        void perimeter(){

            double perimeter = (2 * (length*breadth));
            System.out.println("Perimeter Of Rectangle: "+ perimeter);

        }
    
    
}
