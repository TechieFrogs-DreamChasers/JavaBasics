public class teswitch {
    int i = 10;
    int j = 20;
    float f = 10.5f;
    static byte k = 126; // range -128 to 127
    public static void main(String[]args){
        int a = 10;
        int b = 20;
teswitch sampleobj = new teswitch();
System.out.println(sampleobj.i+" "+sampleobj.j+"  "+a+" "+b);
 switch(sampleobj.i+sampleobj.j)
{
    case 20:
    System.out.println("hi");
    break;
    default:
        System.out.println("instance variable, objects used");
        switch( a +  b ){
            case 10,30: // two values accessed
            System.out.println("local variables accessed, two case values used");
          //  switch(floatf){ not accepted - float, boolean, double
            switch(teswitch.k )// static variable
            {
                case 126:
System.out.println(" this is using static variable");

            }
                
            }

        }

    
}
        
        

    }
    

