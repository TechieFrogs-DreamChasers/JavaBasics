import java.util.Scanner;

class Area2 {
    int length;
    int breadth;
    public Area2(int l,int b){
        length = l;
        breadth = b;
    }
    public int getArea(){
        return length*breadth;
    }
}
class Sol1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l,b;

        System.out.println("Enter length:");
        l = sc.nextInt();
        System.out.println("Enter breadth");
        b = sc.nextInt();

        Area2 a = new Area2(l, b);
        System.out.println("Area: "+a.getArea());

    }
}
