package com.keeplearng.design.pattern.behavioral_xingweixing.strategy_celue;

/**
 * @Author liangyu
 * @create 2020/4/21 9:57 上午
 * @Description
 */
public class EmptyPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("无促销活动！");
    }
}
