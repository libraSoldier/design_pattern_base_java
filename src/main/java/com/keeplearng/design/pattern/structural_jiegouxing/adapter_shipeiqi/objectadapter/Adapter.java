package com.keeplearng.design.pattern.structural_jiegouxing.adapter_shipeiqi.objectadapter;

/**
 * Created by liangyu
 */
public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        //...
        adaptee.adapteeRequest();
        //...
    }
}
