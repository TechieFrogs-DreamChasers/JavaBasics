package com.programs.program7;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        this.color="Red";
        this.filled=true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    protected abstract double get_Area();
    protected abstract double get_Perimeter();

    public String toString(){
        return "Shape Color: "+getColor()+"Shape if Filled: "+isFilled();
    }

}
