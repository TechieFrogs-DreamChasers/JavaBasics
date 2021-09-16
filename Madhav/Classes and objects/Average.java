public class Average {
    int avg(int a,int b,int c)
    {
        int d = (a+b+c)/2;
        return d;
        //System.out.println("Average1 of given numbers is "+d);
    }
    public static void main(String[] args) {

        Average aa = new Average();
        System.out.println(aa.avg(1, 4, 5));
        
    }
}
