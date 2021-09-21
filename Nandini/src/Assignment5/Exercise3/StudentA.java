package Assignment5.Exercise3;

public class StudentA extends Marks {

    @Override
    double getPercentage() {
        // TODO Auto-generated method stub
       double sub1 = 75;
       double sub2 = 80;
       double sub3 = 90;

       double total = (sub1+sub2+sub3);
       double percentage = (total/300.0)*100;
       System.out.println("The Percentage of StudentA is: ");
       return percentage;

    }

    
    
}
