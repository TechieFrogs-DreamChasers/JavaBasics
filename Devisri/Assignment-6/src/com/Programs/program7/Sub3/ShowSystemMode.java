package com.Programs.program7.Sub3;

import com.Programs.program7.Sub2.Model;

public class ShowSystemMode extends Model{

    public static void main(String[] args) {
        // if inner class is protected its showing error.
        //make Mode access to public. it's allowing
        Model model=new ShowSystemMode();
       // Model.Mode mode=model.new Mode();
        ShowSystemMode ssm=new ShowSystemMode();
        //ssm.hibernate(mode);
        //Model model1=new ShowSystemMode();

       // model1.hibernate(mode);
    }

}
