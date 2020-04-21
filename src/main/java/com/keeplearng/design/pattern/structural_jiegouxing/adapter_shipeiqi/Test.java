package com.keeplearng.design.pattern.structural_jiegouxing.adapter_shipeiqi;

/**
 * Created by liangyu
 */
public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();

    }
}
