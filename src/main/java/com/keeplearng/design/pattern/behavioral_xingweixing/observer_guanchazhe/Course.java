package com.keeplearng.design.pattern.behavioral_xingweixing.observer_guanchazhe;

import java.util.Observable;

/**
 * @Author liangyu
 * @create 2020/4/21 11:04 上午
 * @Description rec: 可观察的，（被观察的对象）
 */
public class Course extends Observable {

    private String CourseName;

    public Course(String courseName) {
        CourseName = courseName;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void produceQuestion(Course course, Qusetion qusetion){
        System.out.println(qusetion.getUserName() + "在" + course.getCourseName() + "提交了一个问题");
        // rec: 表示状态发生改变
        setChanged();
        // rec: 通知观察者
        notifyObservers(qusetion);
    }
}
