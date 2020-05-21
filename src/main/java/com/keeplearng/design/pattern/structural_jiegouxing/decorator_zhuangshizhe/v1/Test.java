package com.keeplearng.design.pattern.structural_jiegouxing.decorator_zhuangshizhe.v1;

/**
 * Created by liangyu
 */
public class Test {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc()+" 销售价格:"+battercake.cost());

        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc()+" 销售价格:"+battercakeWithEgg.cost());


        Battercake battercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDesc()+" 销售价格:"+battercakeWithEggSausage.cost());

        /**
         * 装饰者模式总结：
         *
         * 定义：
         * 在不改变原有对象的基础之上，将功能附加到对象上
         * 提供了比继承更有弹性的替代方案（扩展原有对象功能）
         *
         * 适用场景：
         * 扩展了一个类的功能或给一个类添加附加职责
         * 动态的给一个对象添加功能，这些功能可以再动态的撤销
         *
         * 1、优点
         * rec: 继承的有力补充，比继承灵活，不改变原有对象的情况下给一个对象扩展功能
         * rec: 通过使用不同装饰类以及这些装饰类的排列组合，可以实现不同效果
         * rec: 符合开闭原则
         *
         * 2、缺点
         * rec: 会出现更多的代码，更多的类，增加程序复杂性
         * rec: 动态装饰时，多层装饰时会更复杂
         * */


    }
}
