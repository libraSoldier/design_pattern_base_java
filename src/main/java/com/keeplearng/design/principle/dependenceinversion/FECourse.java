package com.keeplearng.design.principle.dependenceinversion;

/**
 * Created by liangyu
 */
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Geely在学习FE课程");
    }

}
