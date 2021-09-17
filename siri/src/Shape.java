public class Shape {
    void shapeprint(){
        System.out.println("This is shape");
    }
    
}
class rect extends Shape{
    void rectprint(){
        System.out.println("This is rect shape ");
    }
}
    class squa extends rect{
        void squaprint(){
            System.out.println("squa is a rect");
           
                
            }
            public static void main(String[] args) {
                squa osqua=new squa();
                osqua.shapeprint();
                osqua.rectprint();
               
            }
        }
    


class circ extends Shape{
    void circprint(){
        System.out.println("This is circ shape");
    }

}
