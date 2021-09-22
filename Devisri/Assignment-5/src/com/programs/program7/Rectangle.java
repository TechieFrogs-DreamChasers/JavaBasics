package com.programs.program7;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(){

    }

    public Rectangle(String color, boolean filled) {

    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    protected double get_Area() {
        return length*width;
    }

    @Override
    protected double get_Perimeter() {
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "Rectangle[Shape color: "+getColor()+", is filled: "+isFilled()+"]," +
                " Width:"+getWidth()+" Length: "+getLength();
    }
}
