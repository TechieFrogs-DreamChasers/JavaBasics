package com.Programs.program7.Sub3;

import com.Programs.program7.Sub.IModel;
import com.Programs.program7.Sub2.Model;

public class ShowSystemMode extends Model{

   public ShowSystemMode(){
       //super();
   }

   public IModel hibernate(ShowSystemMode ssm){
        //Model model=new Model();
        Model.Mode mode=ssm.new Mode();
        return mode;
    }

    public static void main(String[] args) {
        ShowSystemMode ssm=new ShowSystemMode();
        System.out.println(ssm.hibernate(ssm));
    }

}
