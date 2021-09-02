public class Triangle {

   static int a=3,b=4,c=5;


    Triangle()
    {
        int per = a + b + c;

        int s = (a+b+c) / 2 ;

        int e = s * (s-a) * (s - b) * (s-c);

        double area = Math.sqrt(e);

        System.out.println("Area is "+area);

        System.out.println("Perimeter is "+per);

      
    }

    public static void main(String[] args)
    {
        Triangle tri = new Triangle();

    }
    
}
