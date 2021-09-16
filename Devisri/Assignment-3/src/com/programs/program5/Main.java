package com.programs.program5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] side = new int[10];
        for (int i = 0; i < side.length; i++) {
            System.out.println("Enter numbers of side for Square: ");
            side[i] = sc.nextInt();
        }
        for (int j : side) {
            Square square = new Square(j);
            System.out.println("The Area of square of side " + j + " : " + square.getArea());
        }
        sc.close();
    }
}
