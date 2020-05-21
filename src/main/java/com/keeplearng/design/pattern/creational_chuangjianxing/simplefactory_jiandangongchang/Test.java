package com.keeplearng.design.pattern.creational_chuangjianxing.simplefactory_jiandangongchang;

/**
 * Created by liangyu
 */
public class Test {
    public static void main(String[] args) {
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if(video == null){
//            return;
//        }
//        video.produce();

        //rec: 用反射来弥补简单工厂的扩展性
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if(video == null){
            return;
        }
        video.produce();

        /**
         * rec: Java的静态方法会在类的初始化的时候执行
         * rec: jdbc的驱动通过反射Class.forName(***Driver)得到类，相当于Class.forName("***Driver",true,this.getClass().getClassLoader())，会执行类的初始化过程
         * rec: 在Driver类中，静态方法会执行DriverManager.registerDriver(new Driver())，因此在DriverManager中可以直接使用
         * */

        /**
         * rec: 简单工厂设计模型，客户端仅依赖简单工厂类，不与实际的产品相关联，通过传入方法参数的不同
         * rec: 通过传入方法参数的不同，简单工厂类去生产不同的产品
         * rec: 简单工厂类中会存在业务判断，增加新产品时需要修改代码，违反开闭原则
         * */

        /**
         * 简单工厂方法模式总结：
         *
         * 定义：
         * 由一个工厂对象决定创建出哪一种产品类的实例
         *
         * 适用场景：
         * 工厂类负责创建的对象比较少
         * 客户端（应用层）只知道传入工厂类的参数，对于如何创建对象（逻辑）不关心
         *
         * 1、优点
         * rec: 只需要传入一个正确的参数，就可以获取你所需要的对象，而无需知道其创建细节
         *
         * 2、缺点
         * rec: 工厂类的职责相对过重，增加新的产品，需要修改工厂类的判断逻辑，违背开闭原则
         * */

    }

}
