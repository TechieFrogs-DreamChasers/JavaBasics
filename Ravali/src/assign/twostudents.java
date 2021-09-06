package assign;

public class twostudents {
    String name;
    int rollno;
    long phoneno;
    String address;

    twostudents(String name, int rollno, long phoneno, String address){
        this.name=name;
        this.rollno=rollno;
        this.phoneno=phoneno;
        this.address=address;

    }
    public static void main(String[]args){
        twostudents sampleobj1 = new twostudents("sam",1,9491878362L,"wall street");
        twostudents sampleobj2 = new twostudents("john",2,9491878363L,"Kingsford street");
        System.out.println(sampleobj1.name+" "+sampleobj1.rollno+" "+sampleobj1.phoneno+" "+sampleobj1.address);
        System.out.println(sampleobj2.name+" "+sampleobj2.rollno+" "+sampleobj2.phoneno+" "+sampleobj2.address);


    }
    
}
