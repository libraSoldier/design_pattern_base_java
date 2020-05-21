package com.keeplearng.design.pattern.structural_jiegouxing.facade_waiguan_or_menmian;

/**
 * Created by liangyu
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }

    /**
     * 外观or门面模式总结：
     *
     * 定义：
     * 提供了一个统一的接口，用来访问子系统中的一群接口
     * 外观模式定义了一个高层接口，让子系统更容易使用
     *
     * 适用场景：
     * 子系统越来越复杂，增加外观模式提供简单调用接口
     * 构建多层系统结构，利用外观对象作为每层的入口，简化层间调用
     *
     * 1、优点
     * rec: 简化了调用过程，无需了解深入子系统，防止带来风险
     * rec: 减少系统依赖，松散耦合
     * rec: 更好的划分访问层次
     * rec: 符合迪米特法则，即最少知道原则
     *
     * 2、缺点
     * rec: 增加子系统、扩展子系统行为容易引入风险
     * rec: 不符合开闭原则
     * */

}
