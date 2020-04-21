package com.keeplearng.design.pattern.structural_jiegouxing.proxy_daili;

/**
 * Created by liangyu
 */
public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}
