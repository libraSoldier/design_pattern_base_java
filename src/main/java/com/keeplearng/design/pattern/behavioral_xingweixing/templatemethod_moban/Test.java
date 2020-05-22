package com.keeplearng.design.pattern.behavioral_xingweixing.templatemethod_moban;

/**
 * Created by liangyu
 */
public class Test {
    public static void main(String[] args) {
//        System.out.println("后端设计模式课程start---");
//        ACourse designPatternCourse = new DesignPatternCourse();
//        designPatternCourse.makeCourse();
//        System.out.println("后端设计模式课程end---");


        System.out.println("前端课程start---");
        ACourse feCourse = new FECourse(false);
        feCourse.makeCourse();
        System.out.println("前端课程end---");

        /**
         * 模板方法模式总结：
         *
         * 定义：
         * 定义了一个算法的骨架，并允许子类为一个或多个步骤提供实现
         * 模板方法使得子类可以在不改变算法结构的情况下，重新定义算法的某些步骤
         *
         * 适用场景：
         * 一次性实现一个算法的不变的部分，并将可变的行为留给子类来实现
         * 各子类中公共的行为被提取出来并集中到一个公共父类中，从而避免代码重复
         *
         * 1、优点
         * rec: 提高复用性
         * rec: 提高扩展性
         * rec: 符合开闭原则
         *
         * 2、缺点
         * rec: 类数目增加
         * rec: 增加系统实现的复杂度
         * rec: 继承关系自身缺点，如果父类添加新的抽象方法，所以子类都要改一遍
         * */


    }
}
