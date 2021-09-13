package Assignment2;

public class AddDistance {
    
    double inch;
    double feet;

    public AddDistance(double inch,double feet){

        this.inch = inch;
        this.feet = feet;

    }

    public static void main(String[] args) {

        AddDistance d1 = new AddDistance(5, 6);
        AddDistance d2 = new AddDistance(10, 12);
        
        AddDistance result = calculateDistance(d1,d2);
        
        result.showDistance();
        //d1.showDistance();
        //d2.showDistance();
    }

    static AddDistance calculateDistance(AddDistance d1,AddDistance d2){

        AddDistance d = new AddDistance(0,0);
        d.inch = d1.inch + d2.inch;
        d.feet = d1.feet + d2.feet + (d.inch/12);
        d.inch = d.inch%12;
        System.out.println(d.inch + d.feet);
        return d;
    }

    void showDistance(){

       System.out.println("incehes:  " + inch);
       System.out.println("feet: " + feet);
    }
}
