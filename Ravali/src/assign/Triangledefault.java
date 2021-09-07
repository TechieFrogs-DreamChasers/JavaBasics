package assign;

public class Triangledefault {
    int a=3;
    int b=4;
    int c=5;
    double p = (a+b+c)/2;
    double area = Math.sqrt(p*((p-a)*(p-b)*(p-c)));
    public static void main(String[]args){
        Triangledefault sampleobj = new Triangledefault();
        System.out.println("perimeter" + " "+ sampleobj.p);
        System.out.println("Area"+" "+ sampleobj.area);

    }
    
}
