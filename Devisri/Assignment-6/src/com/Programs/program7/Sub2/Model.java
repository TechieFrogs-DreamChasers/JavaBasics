package com.Programs.program7.Sub2;

import com.Programs.program7.Sub.IModel;
import com.Programs.program7.Sub3.ShowSystemMode;

public class Model {

    protected class Mode implements IModel{

        @Override
        public void work() {
            System.out.println("System is in Work mode!!!");
        }

        @Override
        public void rest() {
            System.out.println("System is in Rest mode!!!");
        }
    }

   public void hibernate(Mode m){
        m.rest();
        m.work();
    }
    public static void main(String[] args) {
        Model model=new Model();
        Model.Mode mode=model.new Mode();
        ShowSystemMode ssm=new ShowSystemMode();
        ssm.hibernate(mode);
    }
}
