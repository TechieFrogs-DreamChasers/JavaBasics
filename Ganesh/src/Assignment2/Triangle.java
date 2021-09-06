package Assignment2;

public class Triangle {
    int a = 3;
    int b = 4;
    int c = 5;
    double p = (a+b+c)/2;
    double area  = Math.sqrt(p*((p-a)*(p-b)*(p-c)));

    public static void main(String[] args){
        Triangle obj = new Triangle();
        System.out.println("Parameter : "+obj.p+" \nArea of the Triangle :"+obj.area);
    }
}
