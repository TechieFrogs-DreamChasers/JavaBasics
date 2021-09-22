package com.Programs.program1;

public class Square implements IRegularPolygon{
    @Override
    public double getNumSides() {
        return 4;
    }

    @Override
    public double getSideLength(double n) {

        return n;
    }

    @Override
    public double getPerimeter(double n) {
        return 4*n;
    }

    @Override
    public double getInteriorAngle(double n) {
        double rad=Math.toRadians(180);
        return (n-2)*rad;
    }
}
