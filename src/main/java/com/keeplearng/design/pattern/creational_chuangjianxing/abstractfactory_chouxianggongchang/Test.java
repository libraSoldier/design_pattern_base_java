package com.keeplearng.design.pattern.creational_chuangjianxing.abstractfactory_chouxianggongchang;

/**
 * Created by liangyu
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
