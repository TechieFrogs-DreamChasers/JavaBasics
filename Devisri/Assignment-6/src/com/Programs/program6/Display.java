package com.Programs.program6;

interface Mode1 {
    default void write() {
        System.out.println("This is Mode1 write()");
    }

    default void read() {
        System.out.println("This is Mode1 read()");
    }
}

interface Mode2 {
    default void write() {
        System.out.println("This is Mode2 write()");
    }

    default void read() {
        System.out.println("This is Mode2 read()");
    }
}

interface Mode3 {
    default void write() {
        System.out.println("This is Mode3 write()");
    }

    default void read() {
        System.out.println("This is Mode3 read()");
    }
}

interface Super extends Mode1, Mode2, Mode3 {
    default void readWrite() {
        System.out.println("This is Super readWrite()");
    }

    @Override
    default void write() {
        Mode1.super.write();
    }

    @Override
    default void read() {
        Mode1.super.read();
    }
}

class Show {
    void send() {
        System.out.println("This Show class send()");
    }
}

public class Display extends Show implements Super {
    void display(Super s) {
        s.read();
        s.read();
        s.readWrite();
    }

    public static void main(String[] args) {
        Super s = new Display();
        Display d = new Display();
        d.display(s);
        d.send();

    }
}
