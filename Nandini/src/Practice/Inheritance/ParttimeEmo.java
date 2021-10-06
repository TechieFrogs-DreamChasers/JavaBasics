package Practice.Inheritance;

public class ParttimeEmo extends Employee1 {

    private double hrsWorked;
    private double rate;
    
    public double getHrsWorked(){
        return hrsWorked;
    }
    public void setHrsWorked(double hrsWorked){

        this.hrsWorked = hrsWorked;
    }

    public double getRate(){
        return rate;
    }
    public void setRate(double rate){
        this.rate = rate;
    }

    //For Overloading method same class name with parameter

    /*public void display(String msg){

        System.out.println(msg);
        System.out.println("Hours Worked: " + getHrsWorked());
        System.out.println("Rate: "+ getRate());

    }*/

    //For overriding- Same signature (Overriding possible only in inheritance)

    @Override
    public void display(){

        super.display();
        System.out.println("Hours Worked: " + getHrsWorked());
        System.out.println("Rate: "+ getRate());
    }
    
}
