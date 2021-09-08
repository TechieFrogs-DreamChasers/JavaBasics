import java.lang.reflect.Parameter;

class Triangle2 {
    int a = 3;
    int b = 4;
    int c = 5;
Triangle2(){
    int parameter = a+b+c;
    int area = (a*b)/2;
    System.out.println("Parameter of the triangle "+parameter);
    System.out.println("Area of the Triangle "+area);
    }
    
}
class Ans2{
    public static void main(String[] args) {
        Triangle2 obj = new Triangle2();
    }
}
