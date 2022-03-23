package com.java8.practice.defaultstatic;

public class LocalSystem implements IServer,IClient1,IClient2,IClient3{

    @Override
    public String serverStatus() {
        return "My Local System is using Services from IServer";
    }

    @Override
    public String client3Status() {
        return "My Local System is using Services from IClient3";
    }

    @Override
    public String client2Status() {
        return "My Local System is using Services from IClient2";
    }

    @Override
    public String client1Status() {
        return "My Local System is using Services from IClient1";
    }
    public void show(){
        String client1 = IClient1.super.serverStatus();
        String client2 = IClient2.super.serverStatus();
        String client3 = IClient3.super.serverStatus();
        System.out.println(client1);
        System.out.println(client2);
        System.out.println(client3);
    }
}
