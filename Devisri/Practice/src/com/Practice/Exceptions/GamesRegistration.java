package com.Practice.Exceptions;

class AgeRestriction extends ArithmeticException {
    public AgeRestriction(String s) {
        super(s);
    }
}

class WeightRestriction extends ArithmeticException {
    public WeightRestriction(String s) {
        super(s);
    }
}

public class GamesRegistration {
    public static void main(String[] args) {
        int[] age = {15, 12, 13, 14, 10};
        double[] weight = {45.0, 42.3, 42.6, 39.5, 43.0};
        try{
        checkDetails(age, weight);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    static void checkDetails(int[] age, double[] weight) {
        for (int i = 0; i < age.length; i++) {
            if (age[i] <= 10) {
                throw new AgeRestriction("Student's age is less than criteria");
            } else if (weight[i] < 40) {
                throw new WeightRestriction("Student's weight is less than criteria");
            } else {
                System.out.println("Student Registration Is Valid!!!");
            }
        }
    }
}
/*
Student Registration Is Valid!!!
Student Registration Is Valid!!!
Student Registration Is Valid!!!
Exception in thread "main" com.Practice.Exceptions.WeightRestriction: Student's weight is less than criteria
	at com.Practice.Exceptions.GamesRegistration.checkDetails(GamesRegistration.java:25)
	at com.Practice.Exceptions.GamesRegistration.main(GamesRegistration.java:17)

Student Registration Is Valid!!!
Student Registration Is Valid!!!
Student Registration Is Valid!!!
Student Registration Is Valid!!!
Exception in thread "main" com.Practice.Exceptions.AgeRestriction: Student's age is less than criteria
	at com.Practice.Exceptions.GamesRegistration.checkDetails(GamesRegistration.java:23)
	at com.Practice.Exceptions.GamesRegistration.main(GamesRegistration.java:17)

After handling Exception:

Student Registration Is Valid!!!
Student Registration Is Valid!!!
Student Registration Is Valid!!!
Student Registration Is Valid!!!
Student's age is less than criteria

Student Registration Is Valid!!!
Student Registration Is Valid!!!
Student Registration Is Valid!!!
Student's weight is less than criteria

*/