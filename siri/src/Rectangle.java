public class Rectangle {
    int l=0, b=0;
    Rectangle (int x,int y){
        l=x;
        b=y;



    }
    public double area (){
        double area=(l*b);
        return area;
        //System.out.println("area of rectangle is: "+area);
        


    }
     public static void main(String[] args) {
        Rectangle oRectangle=new Rectangle(4, 5);
        oRectangle.area();
        System.out.println("area of rectangle is: "+oRectangle.area());
        
        
       
        Rectangle oRectangle1=new Rectangle(5, 8);
        oRectangle1.area();
        System.out.println("area of rectangle is: "+oRectangle1.area());
        

        

      
       


    }

    
}
