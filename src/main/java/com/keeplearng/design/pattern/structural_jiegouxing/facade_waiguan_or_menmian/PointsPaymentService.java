package com.keeplearng.design.pattern.structural_jiegouxing.facade_waiguan_or_menmian;

/**
 * Created by liangyu
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift){
        //扣减积分
        System.out.println("支付"+pointsGift.getName()+" 积分成功");
        return true;
    }

}
