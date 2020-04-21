package com.keeplearng.design.principle.dependenceinversion;

/**
 * Created by liangyu
 */
public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Geely在学习Python课程");
    }
}
