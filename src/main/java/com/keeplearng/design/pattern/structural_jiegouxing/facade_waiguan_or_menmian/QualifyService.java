package com.keeplearng.design.pattern.structural_jiegouxing.facade_waiguan_or_menmian;

/**
 * Created by liangyu
 */
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("校验"+pointsGift.getName()+" 积分资格通过,库存通过");
        return true;
    }
}
