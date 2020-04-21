package com.keeplearng.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * Created by liangyu
 */
public class Test {
    public static void main(String[] args) {
        Base child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);
    }
}
