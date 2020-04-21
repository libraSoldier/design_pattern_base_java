package com.keeplearng.design.pattern.creational_chuangjianxing.abstractfactory_chouxianggongchang;

/**
 * Created by liangyu
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
