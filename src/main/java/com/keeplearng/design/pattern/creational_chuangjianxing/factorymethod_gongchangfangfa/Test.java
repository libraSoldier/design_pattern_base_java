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
