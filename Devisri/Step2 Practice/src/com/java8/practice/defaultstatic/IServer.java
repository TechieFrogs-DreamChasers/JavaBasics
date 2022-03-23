package com.java8.practice.defaultstatic;

public interface IServer {
    default String serverStatus(){
        return "Server serves many clients via cloud";
    }
}
