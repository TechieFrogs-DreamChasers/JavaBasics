public class Degree {

    Degree()
    {
        System.out.println("I have a degree");
    }
    public static void main(String[] args) {
        Degree D = new Degree();
        Undergraduate UD = new Undergraduate();
        Postgraduate PD = new Postgraduate();
    }
    
}
class Undergraduate{
    Undergraduate()
    {
        System.out.println("I am a undergraduate");
    }
}
class Postgraduate{
    Postgraduate()
    {
        System.out.println("I am a Postgraduate");
    }
}
