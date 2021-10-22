import java.util.Scanner;

//Illustrate Nested Try,Catch and Finally statements
public class Program24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            try {
                System.out.println("Enter a year: ");
                int year1 = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter number of movies released: ");
                int number1 = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter estimated movie collections: ");
                double amount = sc.nextDouble();
                sc.nextLine();
                checkCollections(number1, year1, amount);
            } catch (YearException | CollectionsException e) {
                System.out.println(e.initCause(e.getCause()));
            } finally {
                System.out.println("Inner Finally Block!!!");
            }
            try {
                System.out.println("Enter start year: ");
                int year1 = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter end year: ");
                int year2 = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter movie release numbers: ");
                int number2 = sc.nextInt();
                sc.nextLine();
                checkReleases(year1, year2, number2);
            } catch (ReleaseException e) {
                System.out.println(e.initCause(e.getCause()));
            } finally {
                System.out.println("Another Inner Finally Block!!!");
            }
            System.out.println("Enter a year: ");
            int year = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter number of movies released: ");
            int number = sc.nextInt();
            sc.nextLine();
            checkYears(year, number);
        } catch (YearException e) {
            System.out.println(e.initCause(e.getCause()));
        } finally {
            System.out.println("Outer Finally Block!!!");
        }
    }

    private static void checkYears(int year, int number) throws YearException {
        if (!(year >= 2021)) {
            System.out.println("Number of movies released in year: " + year + " are: " + number);
        } else {
            throw new YearException("ENTERED INVALID YEAR!!!");
        }
    }

    private static void checkCollections(int number, int year, double amount) throws YearException, CollectionsException {
        long max_Amount = 50000000L;
        amount = max_Amount / number;
        if (year >= 2021) {
            throw new YearException("INVALID YEAR!!!");
        } else if (year < 2021 && number > 100000.0) {
            System.out.println("Average Collection of movies in the year: " + year + " generated is: " + amount);
        } else {
            throw new CollectionsException("NUMBERS ARE INVALID!!!");
        }
    }

    private static void checkReleases(int year1, int year2, int number) throws ReleaseException {
        if (number < 15 || year1 < 2000 || year2 < 2021) {
            throw new ReleaseException("INVALID MOVIE RELEASES AND YEAR!!!");
        } else {
            System.out.println("Movies released in between " + year1 + " and " + year2 + " are: " + number);
        }
    }
}

class YearException extends Exception {
    public YearException(String message) {
        super(message);
    }
}

class CollectionsException extends Exception {
    public CollectionsException(String message) {
        super(message);
    }
}

class ReleaseException extends Exception {
    public ReleaseException(String message) {
        super(message);
    }
}
/*
Enter a year:
2020
Enter number of movies released:
5
Enter estimated movie collections:
50000
CollectionsException: NUMBERS ARE INVALID!!!
Inner Finally Block!!!
Enter start year:
2001
Enter end year:
2021
Enter movie release numbers:
14
ReleaseException: INVALID MOVIE RELEASES AND YEAR!!!
Another Inner Finally Block!!!
Enter a year:
2021
Enter number of movies released:
5
YearException: ENTERED INVALID YEAR!!!
Outer Finally Block!!!
 */