package com.TcaNqit.Coding;
//Selection of MPCS exams and fitness test
public class Question2 {
    public static void main(String[] args) {
        //3 candidates and 3 rounds
        int[][] candidate = new int[3][3];
        //Average of 3 rounds for candidates
        double[] average = new double[3];
        //maximum oxygen level average
        int count = 0;
        candidate[0]=new int[]{95,92,95};
        candidate[1]=new int[]{92,90,92};
        candidate[2]=new int[]{90,92,92};
        //Looping through array and reading values from console
        //range mentioned in question
        //condition checked
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (candidate[i][j] < 0 || candidate[i][j] > 100) {
                    candidate[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Oxygen level of trainee: "+i+" for round: "+j+" : "+candidate[i][j]);
            }
        }

        //Calculating average of each candidate
        //And also average of 3 rounds for each candidate
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                average[i] = average[i] + candidate[j][i];
            }
            average[i] = average[i] / 3;
        }
        //We got average of three rounds for each candidate
        for (int i = 0; i < 3; i++) {
            //Now checking for high values
            if (average[i] > count) {
                //Rounding of average condition checked
                count = (int) average[i];
            }
        }
        //Now if average is equal to count
        //that candidate is selected or all are selected = condition checked
        //if average<70 unfit condition checked
        for (int i = 0; i < 3; i++) {
            if (average[i] == count) {
                System.out.println("Selected Candidate number: " + (i + 1)+" with average oxygen level: "+average[i]);
            }
            if (average[i] < 70) {
                System.out.println("Candidate is Unfit");
            }
        }
    }
}
/*
Oxygen level of trainee: 0 for round: 0 : 95
Oxygen level of trainee: 0 for round: 1 : 92
Oxygen level of trainee: 0 for round: 2 : 95
Oxygen level of trainee: 1 for round: 0 : 92
Oxygen level of trainee: 1 for round: 1 : 90
Oxygen level of trainee: 1 for round: 2 : 92
Oxygen level of trainee: 2 for round: 0 : 90
Oxygen level of trainee: 2 for round: 1 : 92
Oxygen level of trainee: 2 for round: 2 : 92
Selected Candidate number: 3 with average oxygen level: 93.0
 */