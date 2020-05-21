package com.keeplearng.design.pattern.creational_chuangjianxing.abstractfactory_chouxianggongchang;

/**
 * Created by liangyu
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();

        /**
         * rec: 抽象工厂方法设计模式，强调一系列相关的产品对象（属于同一产品族），可以理解为一次性获取某电器品牌的不同产品
         * */

        /**
         * 抽象工厂方法模式总结：
         *
         * 抽象工厂，针对的是产品族，即从美的工厂里面取出的东西都是美的的
         *
         * 产品族：不同品牌产品
         * eg：美的洗衣机，美的空调都是美的（同一品牌）
         * 产品等级结构 - 不同产品类型
         * eg：美的空调，海尔空调，都是空调（同一产品）
         *
         * 定义：
         * 抽象工厂模式提供一个创建一系列相关或相互依赖对象的接口
         * 无需指定他们具体的类
         *
         * 适用场景：
         * 客户端（应用层）不依赖于产品类实例如何被创建、实现等细节
         * 强调一系列相关的产品对象（属于同一产品族）一起使用创建对象需要大量重复的代码
         * 提供一个产品类的库，所有的产品以同样的接口出现，从而使客户端不依赖于具体实现
         *
         * 1、优点
         * rec: 具体产品在应用层代码隔离，无需关心创建细节
         * rec: 将一个系列的产品族统一到一起创建
         *
         * 2、缺点
         * rec: 规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂的接口
         * rec: 增加了系统的抽象性和理解难度
         *
         * */
    }
}
