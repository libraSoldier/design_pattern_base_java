package com.keeplearng.design.pattern.structural_jiegouxing.facade_waiguan_or_menmian;

/**
 * Created by liangyu
 */
public class ShippingService {
    public String shipGift(PointsGift pointsGift){
        //物流系统的对接逻辑
        System.out.println(pointsGift.getName()+"进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
