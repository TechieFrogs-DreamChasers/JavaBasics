package com.java8.practice.defaultstatic;

public interface IClient3 extends IServer {
    default String serverStatus(){
        return "This is Client3 Server Interface";
    }
    default String client3Status(){
        return "This is IClient3 method";
    }
}
