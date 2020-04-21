package com.keeplearng.design.pattern.structural_jiegouxing.decorator_zhuangshizhe.v1;

/**
 * Created by liangyu
 */
public class BattercakeWithEgg extends Battercake {
    @Override
    public String getDesc() {
        return super.getDesc()+" 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }
}
