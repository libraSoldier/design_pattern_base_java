package com.keeplearng.design.principle.dependenceinversion;

/**
 * Created by liangyu
 */
public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("Geely在学习Java课程");
    }
}
