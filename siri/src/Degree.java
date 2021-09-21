public class Degree {
    void getdegree(){
        System.out.println("i got degree");
    }
    
}
class undergraduate{
    void getdegree(){
        System.out.println("i am an undergraduate");
    }

}
class postgraduate{
    void getdegree(){
        System.out.println("i am an postgraduate");
    }
    public static void main(String[] args) {
        postgraduate oPostgraduate=new postgraduate();
        oPostgraduate.getdegree();
        undergraduate oUndergraduate =new undergraduate();
        oUndergraduate.getdegree();
        Degree oDegree =new Degree();
        oDegree.getdegree();

    }

}
