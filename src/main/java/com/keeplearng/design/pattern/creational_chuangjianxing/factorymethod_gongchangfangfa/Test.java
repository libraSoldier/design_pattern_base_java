package com.keeplearng.design.pattern.creational_chuangjianxing.factorymethod_gongchangfangfa;

/**
 * Created by liangyu
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new PythonVideoFactory();
        VideoFactory videoFactory2 = new JavaVideoFactory();
        VideoFactory videoFactory3 = new FEVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();

        /**
         * 工厂方法模式总结：
         *
         * 产品和工厂都进行抽象（抽象产品，抽象工厂），只定义方法，具体的实验下沉到子类（子产品 or 子工厂）实现
         *
         * 定义：
         * 定义一个创建对象的接口，但让实现这个接口的类来决定实例化哪个类，工厂方法让类的实例化推迟到子类中进行
         *
         * 使用场景：
         * 创建对象需要大量重复的代码
         * 客户端（代理层）不依赖于产品类型实例如何被创建，实现等细节
         * 一个类通过其子类来指定创建哪个对象
         *
         * 1、优点
         * rec: 用户只需要关心所需产品对应的工厂，无需关心创建细节
         * rec: 增加新产品符合开闭原则，提高可扩展性
         *
         * 2、缺点
         * rec: 类的个数容易过多，增加复杂度
         * rec: 增加了系统的抽象性和理解难度
         * */

    }

}
