package com.keeplearng.design.pattern.behavioral_xingweixing.command_mingling;

/**
 * @Author liangyu
 * @create 2020/4/21 9:49 下午
 * @Description
 */
public class CourseVideo {

    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open(){
        System.out.println("打开");
    }

    public void close(){
        System.out.println("关闭");
    }
}
