public abstract class Shape {

    
    
    
        abstract void RectanglrArea(int l,int b);
        abstract void CircleArea(int r);
        abstract void squareArea(int s);
        public static void main(String[] args) {
            Area area=new Area();
            area.CircleArea(4);
            area.RectanglrArea(4, 4);
            area.squareArea(5);
        }
        
    }
    class Area extends Shape{
        void RectanglrArea(int l,int b)
        {
            System.out.println("rec area is "+(l*b));
        }
        void CircleArea(int r)
        {
            System.out.println("Circle area is "+(3.14*r*r));
        }
        void squareArea(int s)
        {
            System.out.println("rec area is "+(s*s));
        }
    }
   
