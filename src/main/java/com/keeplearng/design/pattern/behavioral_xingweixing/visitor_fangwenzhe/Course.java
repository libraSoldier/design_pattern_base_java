package com.keeplearng.design.pattern.behavioral_xingweixing.visitor_fangwenzhe;

/**
 * @Author liangyu
 * @create 2020/4/21 10:28 下午
 * @Description
 */
public abstract class Course {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void accept(IVisitor iVisitor);
}
