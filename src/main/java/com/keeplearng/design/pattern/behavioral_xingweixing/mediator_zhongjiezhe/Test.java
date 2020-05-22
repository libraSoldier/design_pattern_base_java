package com.keeplearng.design.pattern.behavioral_xingweixing.mediator_zhongjiezhe;

/**
 * @Author liangyu
 * @create 2020/4/21 10:00 下午
 * @Description
 */
public class Test {

    public static void main(String[] args) {
        User user1 = new User("A");
        User user2 = new User("B");

        user1.sendMessage("B你好，我是A");
        user2.sendMessage("收到，我是B");


        /**
         * 中介者模式总结：
         *
         * 定义：
         * 定义一个封装一组对象如何交互的对象
         * 通过使对象明确地相互引用来促进松散耦合，并允许独立地改变它们的交互
         *
         * 适用场景：
         * 系统中对象之间存在复杂的引用关系，产生的相互依赖关系结构混乱且难以理解
         * 交互的公共行为，如果需要改变行为则可以增加新的中介者类
         *
         * 1、优点
         * rec: 将一对多转化成了一对一、降低程序复杂度
         * rec: 类之间解耦
         *
         * 2、缺点
         * rec: 中介者过多，导致系统复杂
         * */
    }

}
