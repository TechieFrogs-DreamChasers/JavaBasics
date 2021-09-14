public class Point2d {

    public int x=0;
    int y=0;


    Point2d(int x,int y) {
        this.x=x;
    }
    public String toString() {
        return "["+x+","+y+"]";
        
    }
    public static void main(String[] args) {

       Point2d opoint=new Point2d(10,20);

       System.out.println(opoint);

    }

         
     }
    

