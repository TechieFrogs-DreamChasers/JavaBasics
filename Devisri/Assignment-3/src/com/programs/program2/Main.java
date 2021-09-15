package com.programs.program2;

public class Main {
    public static void main(String[] args) {
        Parent parent=new Parent();
        parent.show();//show()-->has public access.-->In that the method calls display method
        System.out.println("**********************");
        Child child=new Child();
        child.display();
        child.show();
    }
}
