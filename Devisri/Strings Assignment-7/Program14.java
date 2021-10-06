//Clear StringBuffer By creating objects
public class Program14 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This is StringBuffer Program.");
        System.out.println("Buffer created is: " + sb);
        sb.setLength(0);
        StringBuffer s = new StringBuffer(sb);
        System.out.println("New Buffer is: " + s);
    }
}
