package com.programs.program7;

public class Square extends Rectangle{
    private double side;

    public Square(){

    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    protected double get_Area() {
        return side*side;
    }

    @Override
    protected double get_Perimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square[Shape color: "+getColor()+", is filled: "+isFilled()+"], Side: "+getSide();
    }
}
