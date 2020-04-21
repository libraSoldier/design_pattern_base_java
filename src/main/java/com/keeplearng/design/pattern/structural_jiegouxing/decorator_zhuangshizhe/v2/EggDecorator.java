package com.keeplearng.design.pattern.structural_jiegouxing.decorator_zhuangshizhe.v2;

/**
 * Created by liangyu
 */
public class EggDecorator extends AbstractDecorator {
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        // rec: 这里是精髓，会将传入的装饰者依次调用
        return super.getDesc()+" 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }
}
