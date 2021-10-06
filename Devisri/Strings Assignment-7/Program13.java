//Clear the StringBuffer using setLength()
public class Program13 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("This ");
        sb.append("is ");
        sb.append("String");
        sb.append("Buffer ");
        sb.append("class.");
        System.out.println("Appended String is: " + sb);
        sb.setLength(0);
        System.out.println("After setLength(0): " + sb);
    }
}
