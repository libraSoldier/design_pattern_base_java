package com.keeplearng.design.pattern.behavioral_xingweixing.observer_guanchazhe;

/**
 * @Author liangyu
 * @create 2020/4/21 2:38 下午
 * @Description
 */
public class Test {

    public static void main(String[] args) {
        Course course = new Course("Java设计模式");
        Teacher teacher1 = new Teacher("A");
        Teacher teacher2 = new Teacher("B");

        course.addObserver(teacher1);
        course.addObserver(teacher2);

        // 业务
        Qusetion qusetion = new Qusetion();
        qusetion.setUserName("B");
        qusetion.setQusetionContent("这是一个问题");

        course.produceQuestion(course, qusetion);

        /**
         * 观察者模式总结：
         *
         * 定义：
         * 定义了对象之间的一对多依赖，让多个观察者对象同时监听某一个主题对象，当主题对象发生变化时，它的所有依赖者（观察者）都会受到通知并更新
         *
         * 适用场景：
         * 关联行为场景，建立一套触发机制
         *
         * 1、优点
         * rec: 观察者和被观察者之间建立一个抽象的耦合
         * rec: 观察者模式支持广播通信
         *
         * 2、缺点
         * rec: 观察者之间有过多的细节依赖、提高时间消耗及程序复杂度
         * rec: 使用要得当，要避免循环调用
         * */
    }

}
