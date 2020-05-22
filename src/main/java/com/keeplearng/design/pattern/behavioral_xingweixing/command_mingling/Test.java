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

        /**
         * 命令模式总结：
         *
         * 把命令抽象为对象
         *
         * 定义：
         * 将"请求"封装成对象，以便使用不同的请求
         * 命令模式解决了应用程序中对象的职责以及它们之间的通信方式
         *
         * 适用场景：
         * 请求调用者和请求接受者需要解耦，使得调用者和接受者不直接交互
         * 需要抽象出等待执行的行为
         *
         * 1、优点
         * rec: 降低耦合
         * rec: 容易扩展新命令或者一组命令
         *
         * 2、缺点
         * rec: 命令的无限扩展会增加类的数量，提高系统实现复杂度
         * */

    }

}
