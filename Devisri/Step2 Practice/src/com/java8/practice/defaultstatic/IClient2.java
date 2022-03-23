package com.java8.practice.defaultstatic;

public interface IClient2 extends IServer {
    default String serverStatus(){
        return "This is Client2 Server Interface";
    }
    default String client2Status(){
        return "This is IClient2 method";
    }
}
