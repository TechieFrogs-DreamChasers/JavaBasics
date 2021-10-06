package Assignment5.Exercise3;

public class StudentB extends Marks{
    
    @Override
    double getPercentage() {
        // TODO Auto-generated method stub
       double sub1 = 70;
       double sub2 = 81;
       double sub3 = 96;
       double sub4 = 69;

       double total = (sub1+sub2+sub3+sub4);
       double percentage = (total/400.0)*100;
       System.out.println("The Percentage of StudentB is: ");
       return percentage;

    }
}
