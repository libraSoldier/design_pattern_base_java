package com.keeplearng.design.pattern.creational_chuangjianxing.builder_jianzaozhe;

/**
 * Created by liangyu
 */
public class Test {
    public static void main(String[] args) {
        // rec：参数尽量使用抽象类和接口
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("Java设计模式精讲",
                "Java设计模式精讲PPT",
                "Java设计模式精讲视频",
                "Java设计模式精讲手记",
                "Java设计模式精讲问答");
        System.out.println(course);

        /**
         * 建造者模式总结：
         *
         * 建造者模式更注重于方法和调用顺序，工厂模式注重于创建产品
         * 建造者模式能够创建一些复杂的产品，由各种复杂的部件组成，工厂模式创建出来都是一个样子
         * 建造者模型需要知道产品是由哪些部件组成的，而工厂模式不需要
         *
         * 1、优点
         * rec: 封装性好，创建和使用分离
         * rec: 扩展性好、建造类之间独立、一定程度上解耦
         *
         * 2、缺点
         * rec: 产生多余的Builder对象
         * rec: 产品内部发生变化，建造者都要修改，成本较大
         *
         * */

    }
}
