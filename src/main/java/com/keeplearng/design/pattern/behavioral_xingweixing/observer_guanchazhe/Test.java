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
    }

}
