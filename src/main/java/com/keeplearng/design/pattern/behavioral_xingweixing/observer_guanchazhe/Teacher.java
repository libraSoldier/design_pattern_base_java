package com.keeplearng.design.pattern.behavioral_xingweixing.observer_guanchazhe;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author liangyu
 * @create 2020/4/21 11:07 上午
 * @Description
 */
public class Teacher implements Observer {

    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course)o;
        Qusetion qusetion = (Qusetion)arg;

        System.out.println(teacherName + "老师的" +
                course.getCourseName()+"课程接受到一个" +
                qusetion.getUserName()+"提交的问题："+
                qusetion.getQusetionContent());
    }
}
