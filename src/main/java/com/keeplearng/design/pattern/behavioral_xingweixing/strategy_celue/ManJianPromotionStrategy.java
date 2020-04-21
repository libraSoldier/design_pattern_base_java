package com.keeplearng.design.pattern.behavioral_xingweixing.strategy_celue;

/**
 * Created by liangyu
 */
public class ManJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("满减促销,满200-20元");
    }
}
