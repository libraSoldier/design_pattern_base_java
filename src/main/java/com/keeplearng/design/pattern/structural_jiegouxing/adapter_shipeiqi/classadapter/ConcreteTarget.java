package com.keeplearng.design.pattern.structural_jiegouxing.adapter_shipeiqi.classadapter;

/**
 * Created by liangyu
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}
