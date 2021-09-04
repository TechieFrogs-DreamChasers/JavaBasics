import java.util.Scanner;

class add{

    int real;
    int img;

    public void addnum(add d1 ,add d2)
    {
        
        real = d1.real + d2.real;
        img = d1.img+d2.img;
        
        display();
        
    }
    public void display()
    {
        System.out.println(real+ " + "+img+"i");
    }

    
}

public class RealnImg
{
    public static void main(String[] args) {
        
        add d1 = new add();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Real number");

        d1.real = sc.nextInt();
        System.out.println("Enter img number");
        d1.img=sc.nextInt();
        
        add d2 = new add();
        System.out.println("Enter Real number");
        d2.real=sc.nextInt();
        System.out.println("Enter img number");
        d2.img=sc.nextInt();

        add d3 = new add();
        d3.addnum(d1, d2);

        

    }
}
