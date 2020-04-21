package com.keeplearng.design.pattern.behavioral_xingweixing.command_mingling;

/**
 * @Author liangyu
 * @create 2020/4/21 9:53 下午
 * @Description
 */
public class Test {

    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("这是一门课程");

        OpenCourseVideoCommand openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);
        CloseCourseVideoCommand closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);

        Staff staff = new Staff();
        staff.addCommand(openCourseVideoCommand);
        staff.addCommand(closeCourseVideoCommand);

        staff.executeCommands();
    }

}
