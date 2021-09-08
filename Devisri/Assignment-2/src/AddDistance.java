public class AddDistance {
    int feet;
    int inch;
    //Step->1
    public AddDistance(int feet, int inch) {
        this.feet = feet;
        this.inch = inch;
    }
    //step->4
    public static void main(String[] args) {
        AddDistance ad1=new AddDistance(5,12);
        //ad1.display();
        AddDistance ad2=new AddDistance(6,7);
        //ad1.display();
        AddDistance result= add(ad1,ad2);
        System.out.println("The Addition of two distances is: ");
        result.display();
    }
    //step->2
    void display(){
        System.out.println("Feet: "+feet);
        System.out.println("Inches: "+inch);
    }
    //step->3
    static AddDistance add(AddDistance first,AddDistance second){
        AddDistance result=new AddDistance(0,0);
        result.inch= first.inch + second.inch;
        result.feet=first.feet + second.feet+ result.inch / 12;
        result.inch= result.inch % 12;
        return result;
    }
}
