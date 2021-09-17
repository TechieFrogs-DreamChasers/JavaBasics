package Assignment4;

public class Program2 {
    void me(int a, char b){
        System.out.println("Sum of variables  : "+(a+b));
    }
    void me(char b, int a){
        System.out.println("Sum of Variables : "+(a+b));
    }

    public static void main(String[] args){
        Program2 me = new Program2();
        me.me('F',52);
        me.me(52,'U');
    }
}
