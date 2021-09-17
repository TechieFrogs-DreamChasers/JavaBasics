public class Studentt {
    String name;
    int age;
    String address;
    Studentt(){
        this.name="unknown";
        this.age=0;
        this.address="defalt";
    }
    void setinfo( String name,int age){
        System.out.println(name + ","+ age );

    }
    void setinfo( String name,int age,String address){
        System.out.println(name +","+ age +" ,"+ address);
    }
    public static void main(String[] args) {
        Studentt oStudentt =new Studentt();
        oStudentt.setinfo("siri", 28, "hyd");//print ten students using array
    }
}
