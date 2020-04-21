package com.keeplearng.design.pattern.structural_jiegouxing.decorator_zhuangshizhe.v2;

/**
 * Created by liangyu
 */
public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }

    public Battercake(){
        System.out.println("调用了类-Battercake-的无参构造方法");
    }

}
