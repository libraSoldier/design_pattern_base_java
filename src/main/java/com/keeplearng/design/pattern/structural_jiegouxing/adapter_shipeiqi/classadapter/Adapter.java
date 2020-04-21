package com.keeplearng.design.pattern.structural_jiegouxing.adapter_shipeiqi.classadapter;

/**
 * Created by liangyu
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        //...
        super.adapteeRequest();
        //...
    }
}
