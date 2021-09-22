package com.Practice.Interface.CubeWithProtected;
//interface with different access modifier inside concrete class=protected.
public class Cube {
    //Inside class an interface can of be any Access modifier
    //except private because you can't access private in derived classes
    protected interface Number{
        public void calculateCube(int n);
    }
}
class Five implements Cube.Number{

    @Override
    public void calculateCube(int n) {
        int cube=n*n*n;
        System.out.println("Cube of 5: "+cube);
    }
}
class Ten implements Cube.Number{

    @Override
    public void calculateCube(int n) {
        int cube=n*n*n;
        System.out.println("Cube of 10: "+cube);
    }
}
class Main{
    public static void main(String[] args) {
        Five five=new Five();
        five.calculateCube(5);
        Ten ten=new Ten();
        ten.calculateCube(10);
    }
}
