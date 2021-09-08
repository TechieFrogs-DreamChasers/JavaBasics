public class Area {
    int length;
    int breadth;
    Area(int l, int b){
        length = l;
        breadth = b;
    }
    public int Dim(){
        int results = length * breadth;
        return results;
    }
    public void Area(){
        System.out.println("Area = "+Dim());
    public static void main(String[] args) {
    Area x= new Area(6,9);
    x.Area();
    }
}
