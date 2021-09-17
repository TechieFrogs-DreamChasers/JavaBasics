public class Rectangle1 {
    int lenth;
    int breath; 
    void area(){
        System.out.println( "area is:  "  +  lenth*breath);
    }
    void parameter(){
        System.out.println(" parameter:   " + (2*lenth+2*breath));
    } 
    Rectangle1(int i,int j){
        this.lenth=i;
        this.breath=j;

    }
}
