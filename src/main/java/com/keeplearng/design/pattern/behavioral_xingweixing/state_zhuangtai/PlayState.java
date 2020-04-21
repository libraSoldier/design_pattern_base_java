package com.keeplearng.design.pattern.behavioral_xingweixing.state_zhuangtai;

/**
 * @Author liangyu
 * @create 2020/4/21 10:42 下午
 * @Description
 */
public class PlayState extends CourseVideoState {
    @Override
    public void play() {
        System.out.println("正常播放");
    }

    @Override
    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
