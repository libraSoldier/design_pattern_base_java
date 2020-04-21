package com.keeplearng.design.principle.singleresponsibility;

/**
 * Created by liangyu
 */
public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();

}
