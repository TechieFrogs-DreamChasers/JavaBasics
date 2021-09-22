package com.Practice.Interface.VehicleWithDefault;
//interface with different access modifier inside concrete class=default
public class VehicleTypes {
    //interface inside concrete class
     interface Vehicle {
        public int getNo_OfWheels();
    }
}

class Bus implements VehicleTypes.Vehicle {

    @Override
    public int getNo_OfWheels() {
        return 6;
    }
}

class Car implements VehicleTypes.Vehicle {

    @Override
    public int getNo_OfWheels() {
        return 4;
    }
}

class Bike implements VehicleTypes.Vehicle {
    @Override
    public int getNo_OfWheels() {
        return 2;
    }
}

class Main {
    public static void main(String[] args) {
        Bike bike = new Bike();
        System.out.println("The Number of Wheels on Bike: " + bike.getNo_OfWheels());//2
        Car car = new Car();
        System.out.println("The Number of Wheels on Car: " + car.getNo_OfWheels());//4
        Bus bus = new Bus();
        System.out.println("The Number of Wheels on Bus: " + bus.getNo_OfWheels());//6
        System.out.println(" ");
        //Accessing Vehicle interface abstract Method:
        VehicleTypes.Vehicle vehicle = new VehicleTypes.Vehicle() {
            @Override
            public int getNo_OfWheels() {
                return 0;
            }
        };
        System.out.println("Vehicle wheels default value:" + vehicle.getNo_OfWheels());//0
        System.out.println(" ");
        VehicleTypes.Vehicle vehicle1 = new Bus();
        System.out.println(vehicle1.getNo_OfWheels());//6
        VehicleTypes.Vehicle vehicle2 = new Car();
        System.out.println(vehicle2.getNo_OfWheels());//4
        VehicleTypes.Vehicle vehicle3 = new Bike();
        System.out.println(vehicle3.getNo_OfWheels());//2
    }
}


