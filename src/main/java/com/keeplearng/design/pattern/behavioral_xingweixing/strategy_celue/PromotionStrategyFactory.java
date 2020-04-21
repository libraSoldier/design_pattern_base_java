package com.keeplearng.design.pattern.behavioral_xingweixing.strategy_celue;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author liangyu
 * @create 2020/4/20 6:03 下午
 * @Description
 */
public class PromotionStrategyFactory {

    private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<String, PromotionStrategy>();

    private static final EmptyPromotionStrategy NON_PROMOTION = new EmptyPromotionStrategy();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.FANXIAN, new FanXianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.LIJIAN, new LiJianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.MANJIAN, new ManJianPromotionStrategy());
    }

    private PromotionStrategyFactory(){
    }

    public static PromotionStrategy getPromotionStrategy(String PROMOTION_KEY){

        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(PROMOTION_KEY);

        return promotionStrategy==null ? NON_PROMOTION : promotionStrategy;
    }

    private interface PromotionKey{
        String LIJIAN = "LIJIAN";
        String FANXIAN = "FANXIAN";
        String MANJIAN = "MANJIAN";
    }
}
