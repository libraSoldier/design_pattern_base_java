package com.keeplearng.design.pattern.behavioral_xingweixing.visitor_fangwenzhe;

/**
 * @Author liangyu
 * @create 2020/4/21 10:28 下午
 * @Description
 */
public class FreeCourse extends Course {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
