package com.threads.practice;

public class TestMultiplications {
    public static void numberSquares(int number){
        for(int i=1;i<=number;i++){
            if(i%2==0)
                System.out.println(">>>Printing from TestSquares: "+i*i);
            else
                System.out.println(">>>Printing from TestSquares: "+i);
        }
    }
    public static void numberCubes(int number){
        for(int i=1;i<=number;i++){
            if(i%2==0)
                System.out.println(">>>Printing from TestCubes: "+i);
            else
                System.out.println(">>>Printing from TestSquares: "+i*i*i);
        }
    }
    public static void numberQuads(int number){
        for(int i=1;i<=number;i++){
            if(i%2==0)
                System.out.println(">>>Printing from TestQuads: "+i*i*i*i);
            else
                System.out.println(">>>Printing from TestQuads: "+i);
        }
    }
}
