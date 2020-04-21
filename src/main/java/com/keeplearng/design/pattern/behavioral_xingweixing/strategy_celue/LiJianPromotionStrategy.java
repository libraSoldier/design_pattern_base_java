package com.keeplearng.design.pattern.behavioral_xingweixing.strategy_celue;

/**
 * Created by liangyu
 */
public class LiJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("立减促销,课程的价格直接减去配置的价格");
    }
}
