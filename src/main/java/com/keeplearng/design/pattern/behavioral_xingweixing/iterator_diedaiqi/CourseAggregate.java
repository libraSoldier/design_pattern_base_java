package com.keeplearng.design.pattern.behavioral_xingweixing.iterator_diedaiqi;

/**
 * Created by liangyu.
 */
public interface CourseAggregate {

    void addCourse(Course course);
    void removeCourse(Course course);

    CourseIterator getCourseIterator();



}
