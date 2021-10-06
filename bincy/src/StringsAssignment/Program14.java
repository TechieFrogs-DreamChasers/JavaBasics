package StringsAssignment;
//Clear StringBuffer by creating a new object
public class Program14 {
    public static void main(String[] args){
        StringBuffer obj = new StringBuffer();
        obj.append("Hi How are you doing?");
        obj.append("I am doing good. ");
        System.out.println(obj);

        obj = new StringBuffer();
        System.out.println(obj);
    }
}
