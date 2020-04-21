package com.keeplearng.design.pattern.behavioral_xingweixing.visitor_fangwenzhe;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author liangyu
 * @create 2020/4/21 10:29 下午
 * @Description
 */
public class Test {

    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<Course>();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("免费课程");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("收费课程");
        codingCourse.setPrice(100);

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        for (Course course : courseList){
            course.accept(new Visitor());
        }
    }
}
