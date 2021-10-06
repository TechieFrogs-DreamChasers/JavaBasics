package com.Programs.program1;

//(n-2)*180=sum of interior angles;((intsum/180)+2=n)
//number[i]
public interface IRegularPolygon {
    double getNumSides();

    double getSideLength(double n);

    static int totalSides(double[] number) {
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            int n = (int) ((number[i] / 180) + 2);
            // System.out.println(n);(7,5,4,5,6)
            sum += n;
        }
        return sum;
    }

    //assuming a pentagon
    default double getPerimeter(double n) {
        return 5 * n;
    }

    //assuming pentagon
    default double getInteriorAngle(double n) {
        double rad = Math.toRadians(180.0);
        return (n - 2) * rad;
    }
}
