package com.Practice.Interface.Animals;

import java.lang.reflect.Constructor;

public interface Herbivores {
    /*
    Constructor not allowed.
    Asking to make class.
    As Constructors belong to class.
    No object is created for Interface.
    Initialization,static blocks are not allowed
    */
    //Herbivores(){}
    void sleep();
    void move();
    void chew();
}
