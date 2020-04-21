package com.keeplearng.design.pattern.structural_jiegouxing.decorator_zhuangshizhe.v1;

/**
 * Created by liangyu
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg {
    @Override
    public String getDesc() {
        return super.getDesc()+ " 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
