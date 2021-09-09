public class Student2 {
    String name;
    int rno;
    static double pno;
    static double add;


     Student2(String n, int r, double i, double j){
        this.name=n;
        this.rno=r;
        Student2.pno=i;
        Student2.add=j;

    }
    void display(){
        System.out.println(name+" "+rno+" "+pno+" "+add);
        
    }
    public static void main(String[] args) {
        Student2 s1=new Student2("sam", 1, 34456, 166);
        Student2 s2=new Student2("john",2,1234567890,27);
        s1.display();
        s2.display();


    }
}
