public class Parent {
    String place="house";
}
class child extends Parent{
    long cash=10000000;
    public static void main(String[] args) {
    child oChild = new child();
    System.out.println("place  "  + oChild.place +    "    cash  " + oChild.cash);

    }
    
}
