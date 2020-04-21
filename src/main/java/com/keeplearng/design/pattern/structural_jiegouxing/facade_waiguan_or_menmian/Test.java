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
}
