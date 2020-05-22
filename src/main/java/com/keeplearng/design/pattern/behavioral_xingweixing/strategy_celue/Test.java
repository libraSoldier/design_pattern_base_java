package com.keeplearng.design.pattern.behavioral_xingweixing.strategy_celue;

/**
 * Created by liangyu
 */
public class Test {
//    public static void main(String[] args) {
//        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
//        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());
//
//        promotionActivity618.executePromotionStrategy();
//        promotionActivity1111.executePromotionStrategy();
//    }

//    public static void main(String[] args) {
//        PromotionActivity promotionActivity = null;
//        String promotionKey = "LIJIAN";
//
//        if (StringUtils.equals(promotionKey, "LIJIAN")) {
//            promotionActivity = new PromotionActivity(new LiJianPromotionStrategy());
//        } else if(StringUtils.equals(promotionKey, "FANXIAN")) {
//            promotionActivity = new PromotionActivity(new FanXianPromotionStrategy());
//        }
//        promotionActivity.executePromotionStrategy();
//    }

        public static void main(String[] args) {

        String promotionKey = "LIJIAN";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.executePromotionStrategy();
    }

    /**
     * 策略模式总结：
     *
     * 定义：
     * 定义了算法家族，分别封装起来，让他们之间可以互相替换，此模式让算法的变化不会影响到使用算法的用户
     * if...else...
     *
     * 适用场景：
     * 系统有很多类，而他们的区别仅仅在于他们的行为不同
     * 一个系统需要动态地在几种算法中选择一种
     *
     * 1、优点
     * rec: 开闭原则
     * rec: 避免使用多重条件转义语句
     * rec: 提高算法的保密性和安全性
     *
     * 2、缺点
     * rec: 客户端必须知道所有的策略类，并自行决定使用哪一个策略类
     * rec: 产生很多策略类
     * */


}
