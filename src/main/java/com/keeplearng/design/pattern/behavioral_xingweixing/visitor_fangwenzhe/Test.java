package com.keeplearng.design.pattern.behavioral_xingweixing.visitor_fangwenzhe;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author liangyu
 * @create 2020/4/21 10:29 下午
 * @Description
 */
public class Test {

    /**
     * 访问者模式总结：
     *
     * 定义：
     * 封装作用于某种数据结构（如List/Set/Map等）中的各元素的操作
     * 可以在不改变各元素的类的前提下，定义作用于这些元素的操作
     *
     * 适用场景：
     * 一个数据结构（如List/Set/Map等）包含很多类型对象
     * 数据结构与数据操作分离
     *
     * 1、优点
     * rec: 增加新的操作很容易，即增加一个新的访问者
     *
     * 2、缺点
     * rec: 增加新的数据结构困难
     * rec: 具体元素变更比较麻烦
     * */

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
