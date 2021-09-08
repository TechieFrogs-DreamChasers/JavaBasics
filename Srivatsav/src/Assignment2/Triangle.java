class Triangle {
    int a,b,c;
    public double Area(){
        double q = (a+b+c)/2.0;
        return Math.pow((q*(q-a)*(q-b)*(q-c)),.5);
    }
    public double Perimeter(){
        return (a+b+c)/2.0;
    }
}
class Ans{
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.a = 3;
        t.b = 4;
        t.c = 5;
        System.out.println(t.Area());
        System.out.println(t.Perimeter());
    }
}
