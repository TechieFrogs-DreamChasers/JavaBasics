import java.util.Scanner;

class Distance{

    int inches;
    int feet;

    public void addDistance(Distance d1 ,Distance d2)
    {
        
        inches = d1.inches + d2.inches;
        feet= d1.feet+d2.feet+(inches/12);
        inches= inches%12;
        display();
        
    }
    public void display()
    {
        System.out.println("Feet is " +feet+ " Inches is "+inches);
    }

    
}

public class FeetandInch
{
    public static void main(String[] args) {
        
        Distance d1 = new Distance();
        Scanner sc = new Scanner(System.in);

        d1.inches = sc.nextInt();
        d1.feet=sc.nextInt();
        
        Distance d2 = new Distance();

        d2.inches=sc.nextInt();
        d2.feet=sc.nextInt();

        Distance d3 = new Distance();
        d3.addDistance(d1, d2);

        

    }
}