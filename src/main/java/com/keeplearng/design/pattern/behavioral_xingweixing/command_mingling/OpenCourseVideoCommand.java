package com.keeplearng.design.pattern.behavioral_xingweixing.command_mingling;

/**
 * @Author liangyu
 * @create 2020/4/21 9:51 下午
 * @Description
 */
public class OpenCourseVideoCommand implements Command {

    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
