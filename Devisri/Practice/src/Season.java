public class Season {
    static String name;
    static String type;
    void life(){
        System.out.println("Life goes on irrespective of season---- Main class method called");
    }
    public static void main(String[] args) {
        Season season=new Season();
        System.out.println(Season.name="Any Season");
        System.out.println(Season.type="Depends on Season");
        season.life();
        System.out.println("***********************");
        Season season2=new Season();
        //Here I changed static variables
        System.out.println(Season.name="Spring");
        System.out.println(Season.type="Sunny and pleasant");
        season2.life();

        Winter winter=new Winter();
        System.out.println(winter.name="Winter");
        System.out.println(winter.type="Cool Season");
        winter.cold();

        Summer summer=new Summer();
        System.out.println(summer.name="Summer");
        System.out.println(summer.type="Hot Season");
        summer.hot();

        Monsoon monsoon=new Monsoon();
        System.out.println(monsoon.name="Monsoon");
        System.out.println(monsoon.type="Rainy");
        monsoon.rainy();
    }
}

class Winter{
    String name;
    String type;
    void cold(){
        System.out.println("Winter Season is very cold-----Winter class cold() called ");
    }
    public static void main(String[] args) {
        Season season=new Season();
        //cnanged static variable name again
        Season.name="Any Season";
        Season.type="Season Type";
        System.out.println(Season.name);
        System.out.println(Season.type);
        season.life();

        Winter winter=new Winter();
        System.out.println(winter.name="Winter");
        System.out.println(winter.type="Cool Season");
        winter.cold();

    }
}
class Summer{
    String name;
    String type;
    void hot(){
        System.out.println("Summer Season is very hot-----Summer class hot() called ");
    }
    public static void main(String[] args) {
        Season season=new Season();
        System.out.println(Season.name="Any Season");
        System.out.println(Season.type="Depends on Season");
        season.life();

        Summer summer=new Summer();
        System.out.println(summer.name="Summer");
        System.out.println(summer.type="Hot Season");
        summer.hot();
    }
}
class Monsoon{
    String name;
    String type;
    void rainy(){
        System.out.println("Monsoon Season is often rainy----Monsoon class rainy() called");
    }
    public static void main(String[] args) {
        Season season=new Season();
        System.out.println(Season.name="Any Season");
        System.out.println(Season.type="Depends on Season");
        season.life();

        Monsoon monsoon=new Monsoon();
        System.out.println(monsoon.name="Monsoon");
        System.out.println(monsoon.type="Rainy");
        monsoon.rainy();
    }
}
