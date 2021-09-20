package com.Practice.Interface.Address;

public class Main {
    public static void main(String[] args) {
        Manager manager=new Manager("John",40,60000.0,'M');
        manager.display();
        manager.show_Address();
        manager.isEmployed();
        manager.haveCar();
        manager.haveHouse();
    }
}
