package com.keeplearng.design.pattern.structural_jiegouxing.adapter_shipeiqi.objectadapter;

/**
 * Created by liangyu
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();



    }
}
