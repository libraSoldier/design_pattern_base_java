package com.keeplearng.design.pattern.behavioral_xingweixing.templatemethod_moban;

/**
 * Created by liangyu
 */
public class DesignPatternCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }

}
