package com.keeplearng.design.pattern.behavioral_xingweixing.visitor_fangwenzhe;

/**
 * @Author liangyu
 * @create 2020/4/21 10:29 下午
 * @Description
 */
public class Visitor implements IVisitor{
    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("免费课程：" + freeCourse.getName());
    }

    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("实战课程：" + codingCourse.getName() + "，价格：" + codingCourse.getPrice());
    }
}
