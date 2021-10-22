import java.util.Scanner;

//Handling Multiple Exceptions DivideByZero
public class Program10 {
    public static void main(String[] args) {
        System.out.println("Number of Months: ");
        Scanner sc = new Scanner(System.in);
        try {
            int month = sc.nextInt();
            sc.nextLine();
            sal_Employee1(month);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Number of Months: ");
        try {
            int month = sc.nextInt();
            sc.nextLine();
            sal_Employee2(month);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Number of Months: ");
        try {
            int month = sc.nextInt();
            sc.nextLine();
            sal_Employee3(month);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }

    static void sal_Employee1(int month) {
        int[] ann_Savings = {10000, 8000, 3500, 5000, 7000, 2000, 9000, 15000, 20000, 12000, 11300, 16579};
        int avg_Month_Savings = 0;
        for (int ann_saving : ann_Savings) {
            avg_Month_Savings = ann_saving / month;
        }
        System.out.println("Average of " + month + " months savings is: " + avg_Month_Savings);
    }

    static void sal_Employee2(int month) {
        int[] ann_Savings = {5000, 2000, 3500, 5000, 4000, 2000, 1000, 4000, 2000, 1200, 1130, 1659};
        int avg_Month_Savings = 0;
        for (int ann_saving : ann_Savings) {
            avg_Month_Savings = ann_saving / month;
        }
        System.out.println("Average of " + month + " months savings is: " + avg_Month_Savings);
    }

    static void sal_Employee3(int month) {
        int[] ann_Savings = {1000, 800, 3500, 9000, 7000, 2000, 9000, 20000, 5700, 12000, 11300, 23658};
        int avg_Month_Savings = 0;
        for (int ann_saving : ann_Savings) {
            avg_Month_Savings = ann_saving / month;
        }
        System.out.println("Average of " + month + " months savings is: " + avg_Month_Savings);
    }
}
/*
Number of Months:
5
Average of 5 months savings is: 3315
Number of Months:
0
/ by zero
Number of Months:
0
/ by zero
 */