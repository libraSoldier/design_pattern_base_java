package com.keeplearng.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * Created by liangyu
 */
public class Base {
    public void method(HashMap map){
        System.out.println("父类被执行");
    }
}
