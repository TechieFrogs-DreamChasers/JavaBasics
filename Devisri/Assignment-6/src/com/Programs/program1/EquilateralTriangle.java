package com.Programs.program1;

public class EquilateralTriangle implements IRegularPolygon{
    @Override
    public double getNumSides() {
        return 3;
    }

    @Override
    public double getSideLength(double n) {
        return n;
    }

    @Override
    public double getPerimeter(double n) {
        return (3*n);
    }

    @Override
    public double getInteriorAngle(double n) {
        double rad=Math.toRadians(180.0);
        return (n-2)*rad;
    }
}
