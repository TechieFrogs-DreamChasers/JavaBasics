package com.java8.practice.defaultstatic;

public class LocalSystemMain {
    public static void main(String[] args) {
        LocalSystem localSystem = new LocalSystem();
        System.out.println(localSystem.serverStatus());
        System.out.println(localSystem.client1Status());
        System.out.println(localSystem.client2Status());
        System.out.println(localSystem.client3Status());
        localSystem.show();
        System.out.println(" ");
        IServer server = new LocalSystem();
        System.out.println(server.serverStatus());
    }
}
