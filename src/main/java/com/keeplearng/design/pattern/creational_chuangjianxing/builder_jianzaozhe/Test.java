package com.keeplearng.design.pattern.creational_chuangjianxing.builder_jianzaozhe;

/**
 * Created by liangyu
 */
public class Test {
    public static void main(String[] args) {
        // rec：参数尽量使用抽象类和接口
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("Java设计模式精讲",
                "Java设计模式精讲PPT",
                "Java设计模式精讲视频",
                "Java设计模式精讲手记",
                "Java设计模式精讲问答");
        System.out.println(course);

    }
}