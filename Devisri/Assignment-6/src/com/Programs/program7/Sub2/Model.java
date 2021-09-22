package com.Programs.program7.Sub2;

import com.Programs.program7.Sub.IModel;

public class Model {

    public class Mode implements IModel{

        @Override
        public void work() {
            System.out.println("System is in Work mode!!!");
        }

        @Override
        public void rest() {
            System.out.println("System is in Rest mode!!!");
        }
    }

}
