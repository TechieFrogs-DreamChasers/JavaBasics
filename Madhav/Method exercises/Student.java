import java.util.*;

public class Student
{
    String name;
    int age;
    String address;

    public Student()
    {
        this.name="unknown";
        this.age=0;
        this.address="not avaliable";
    }
    public void setinfo(int age,String name)
    {
        this.name=name;
        this.age=age;
    }
    public void setinfo(int age ,String name,String address)
    {
        this.name=name;
        this.age=age;
        this.address=address;
    }
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setinfo(20, "Madhav");
        System.out.println(stu.age+ "   "+stu.name+"   "+stu.address);
        stu.setinfo(26, "Maddy");
        System.out.println(stu.age+ "   "+stu.name+"   "+stu.address);
        stu.setinfo(24, "Katta");
        System.out.println(stu.age+ "   "+stu.name+"   "+stu.address);
        stu.setinfo(32, "jujubi","443x fgv");
        System.out.println(stu.age+ "   "+stu.name+"   "+stu.address);
        stu.setinfo(30, "Nonono","78 gfgh fgytu");
        System.out.println(stu.age+ "   "+stu.name+"   "+stu.address);
        stu.setinfo(20, "lakshmi","34 gghh,ghj");
        System.out.println(stu.age+ "   "+stu.name+"   "+stu.address);
        stu.setinfo(10, "Kkkak");
        System.out.println(stu.age+ "   "+stu.name+"   "+stu.address);
        stu.setinfo(60, "Mafdasa");
        System.out.println(stu.age+ "   "+stu.name+"   "+stu.address);
        stu.setinfo(20, "dfgh");
        System.out.println(stu.age+ "   "+stu.name+"   "+stu.address);
        stu.setinfo(20, "tytyav");
        System.out.println(stu.age+ "   "+stu.name+"   "+stu.address);

    }
}
