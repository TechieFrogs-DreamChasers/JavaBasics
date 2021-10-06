package StringsAssignment;
//Program to clear StringBuffer using setLength()
public class Program13 {
    public static void main(String[] args){
        StringBuffer obj = new StringBuffer();
        obj.append("Java");
        obj.append(" Strings ");
        obj.append(5);
        obj.append('g');
        obj.append(12.67);
        System.out.println(obj);

        obj.setLength(0);
        System.out.println("New EmptyString: "+obj);
    }
}
