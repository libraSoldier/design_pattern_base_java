package com.keeplearng.design.pattern.structural_jiegouxing.proxy_daili.dynamicproxy;

import com.keeplearng.design.pattern.structural_jiegouxing.proxy_daili.Order;
import com.keeplearng.design.pattern.structural_jiegouxing.proxy_daili.IOrderService;
import com.keeplearng.design.pattern.structural_jiegouxing.proxy_daili.OrderServiceImpl;

/**
 * Created by liangyu
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
//        order.setUserId(2);
        order.setUserId(1);
        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();

        orderServiceDynamicProxy.saveOrder(order);

        /**
         * 代理模式总结：
         *
         * 定义：
         * 为其它对象提供一种代理，以控制对这个对象的访问
         * 代理对象在客户端和目标对象之间起到中介的作用
         *
         * 适用场景：
         * 保护目标对象
         * 增强目标对象
         *
         * 1、优点
         * rec: 代理模式能将代理对象与真实被调用的目标对象分离
         * rec: 一定程度上降低了系统的耦合度，扩展性好
         * rec: 保护目标对象
         *
         * 2、缺点
         * rec: 代理模式会造成系统设计中类的数目增加
         * rec: 在客户端和目标对象增加一个代理对象，会造成请求处理速度变慢
         * rec: 增加系统的复杂度
         * */
    }
}
