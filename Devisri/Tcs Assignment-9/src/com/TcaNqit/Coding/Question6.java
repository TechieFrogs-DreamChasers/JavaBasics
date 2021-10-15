package com.TcaNqit.Coding;

import java.util.Scanner;

//A City Bus is a Ring Route Bus which runs in circular fashion.
public class Question6 {
    public static void main(String[] args) {
        System.out.println("Enter Source stop: ");
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        System.out.println("Enter Destination stop: ");
        String des = sc.nextLine();
        float fare = getFare(src, des);
        System.out.println("Your Bus fare for the travel: " + fare + "INR");
        sc.close();
    }

    static float getFare(String src, String des) {
        String[] stops = {"TH", "GA", "IC", "HA", "TE", "LU", "NI", "CA"};
        int[] path_Distance = {800, 600, 750, 900, 1400, 1200, 1100, 1500};
        //fare declaration
        float fare = 0.0f;
        //starting stop index
        int start = 0;
        //last stop index
        int end = 0;
        for (int i = 0; i < stops.length; i++) {
            //if src is in this stops index value
            // start is the array index
            if (stops[i].contains(src)) {
                start = i;
            }
            //if des is in this stops index value
            // end is the array index
            else if (stops[i].contains(des)) {
                end = i;
            }
        }
        //if destination & src are same condition check
        if (start == end) {
            System.out.println("INVALID OUTPUT");
        }
        else {
            //Holding the next stop index into temp
            int temp = start + 1;
            //Condition holds until temp!=end+1
            while (temp != (end + 1)) {
                //Adding the fares between the stops
                fare += path_Distance[temp];
                temp = (temp + 1) % 8;
            }
            fare = fare / 200;
        }
        return (float) Math.ceil(fare);
    }
}
/*
Enter Source stop:
NI
Enter Destination stop:
HA
Your Bus fare for the travel: 23.0INR

Enter Source stop:
ni
Enter Destination stop:
ha
INVALID OUTPUT
Your Bus fare for the travel: 0.0INR

 */
