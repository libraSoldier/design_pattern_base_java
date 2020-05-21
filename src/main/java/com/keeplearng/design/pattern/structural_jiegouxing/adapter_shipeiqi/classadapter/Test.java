package com.keeplearng.design.pattern.structural_jiegouxing.adapter_shipeiqi.classadapter;

/**
 * Created by liangyu
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();

        /**
         * 适配器模式总结：
         *
         * 1、优点
         * rec: 能提高类的透明性和复用，现有的类复用但不需要改变
         * rec: 目标类和适配器类解耦，提高程序扩展性
         * rec: 符合开闭原则
         *
         * 2、缺点
         * rec: 适配器编写过程需要全面考虑，可能会增加系统的复杂性
         * rec: 增加系统代码可读的难度
         * */


    }
}
