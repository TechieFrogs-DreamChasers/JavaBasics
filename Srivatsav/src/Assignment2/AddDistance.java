import java.util.Scanner;

class AddDistance{
    double inch;
    double feet;
    void getData(Scanner sc){
        System.out.println("enter Distance in Inch:");
        this.inch = sc.nextDouble();
    }
    double inchtofeet(){
        this.feet = (0.08333333*this.inch);
        return feet;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddDistance d1 = new AddDistance();
        d1.getData(sc);
        AddDistance d2 = new AddDistance();
        d2.getData(sc);
        double x = d1.inchtofeet();
        double y = d2.inchtofeet();
        double sumofdistances = x+y;
        System.out.println("Sum of Distance in Feet: "+ sumofdistances);

        sc.close();
    }

}