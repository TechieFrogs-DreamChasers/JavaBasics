package PRACTICE.TypeCasting;
//String to integer
public class StringToInt {
    public static void main(String[] args){
        String str ="40";
        int num = Integer.parseInt(str);
        int i =50;
        System.out.println(num);
        num = Integer.valueOf(str);
        System.out.println(num);
        str = Integer.toString(i);
        System.out.println(str);
        int w =(int) 888.8;
        byte x = (byte)100L;
        long y = 100;
        byte z = (byte)100L;
        System.out.println(w+" "+x+" "+y+" "+z);
    }
}
