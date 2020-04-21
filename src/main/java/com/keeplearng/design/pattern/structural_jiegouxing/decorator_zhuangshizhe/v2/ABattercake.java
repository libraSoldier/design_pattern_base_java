package com.keeplearng.design.pattern.structural_jiegouxing.decorator_zhuangshizhe.v2;

/**
 * Created by liangyu
 */
public abstract class ABattercake {
    protected abstract String getDesc();
    protected abstract int cost();

    public ABattercake(){
        System.out.println("调用了抽象类-ABattercake-的无参构造方法");
    }
}
