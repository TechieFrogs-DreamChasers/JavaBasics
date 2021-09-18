package Assignment4;

public class Degree {
    void getDegree(){
        System.out.println("I got a degree");
    }
}
class Undergraduate{
    void getDegree(){
        System.out.println("I a Undergraduate");
    }
}
class Postgraduate {
    void getDegree(){
        System.out.println("I a Postgraduate");
    }
    public static void main(String[] args){
        Degree D = new Degree();
        D.getDegree();
        Undergraduate Ug = new Undergraduate();
        Ug.getDegree();
        Postgraduate Pg = new Postgraduate();
        Pg.getDegree();
        
    }
}
