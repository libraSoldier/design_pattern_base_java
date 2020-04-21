package com.keeplearng.design.pattern.structural_jiegouxing.proxy_daili.staticproxy;

import com.keeplearng.design.pattern.structural_jiegouxing.proxy_daili.Order;

/**
 * Created by liangyu
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
