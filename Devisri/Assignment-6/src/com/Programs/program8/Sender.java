package com.Programs.program8;

public class Sender {
    ILetter display() {
        System.out.println("This is display()");
        class Receiver implements ILetter {
            @Override
            public void write() {
                System.out.println("This is a write() method in Local class Receiver!!!");
            }
        }
        //Receiver receiver=new Receiver();
        ILetter letter = new Receiver();
        return letter;
    }

    public static void main(String[] args) {
        Sender sender = new Sender();
        System.out.println(sender.display());
    }
}
