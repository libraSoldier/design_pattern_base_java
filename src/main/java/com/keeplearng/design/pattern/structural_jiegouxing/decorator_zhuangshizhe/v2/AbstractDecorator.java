package com.keeplearng.design.pattern.structural_jiegouxing.decorator_zhuangshizhe.v2;

/**
 * Created by liangyu
 */
public abstract class AbstractDecorator extends ABattercake {
    // rec： 用于存储传入的装饰者类
    public ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    protected abstract void doSomething();

    @Override
    protected String getDesc() {
        // rec: 这里的this其实是传入的上一个装饰者
        return this.aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}
