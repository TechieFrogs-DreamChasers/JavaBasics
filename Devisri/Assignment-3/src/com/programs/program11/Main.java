package com.programs.program11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder(5.0,"Red",10.0);
        System.out.println("The Surface Area of Cylinder: "+cylinder.get_Area(5.0));
    }
}
