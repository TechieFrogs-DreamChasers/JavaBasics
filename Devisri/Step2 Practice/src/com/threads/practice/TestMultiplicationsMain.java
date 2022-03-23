package com.threads.practice;

public class TestMultiplicationsMain {
    public static void main(String[] args) {
        System.out.println("====Application Started!!!====");
        TestSquares squares = new TestSquares();
        squares.start();
        try {
            squares.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread = new Thread(new TestCubes());
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        TestQuads quads = new TestQuads();
        quads.start();
        try {
            quads.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("====Application Stopped!!!====");
    }
}
