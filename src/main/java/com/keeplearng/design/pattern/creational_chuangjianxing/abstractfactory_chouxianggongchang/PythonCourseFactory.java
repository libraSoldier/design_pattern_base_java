package com.keeplearng.design.pattern.creational_chuangjianxing.abstractfactory_chouxianggongchang;

/**
 * Created by liangyu
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
