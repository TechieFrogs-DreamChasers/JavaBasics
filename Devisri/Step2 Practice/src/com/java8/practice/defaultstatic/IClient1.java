package com.java8.practice.defaultstatic;

public interface IClient1 extends IServer {
    default String serverStatus(){
        return "This is Client1 Server Interface";
    }
    default String client1Status(){
        return "This is IClient1 method";
    }
}
