package com.keeplearng.design.pattern.behavioral_xingweixing.state_zhuangtai;

/**
 * @Author liangyu
 * @create 2020/4/21 10:56 下午
 * @Description
 */
public class Test {

    /**
     * 状态模式总结：
     *
     * 定义：
     * 允许一个对象在其内部状态改变时，改变它的行为
     *
     * 适用场景：
     * 一个对象存在多个状态（不同状态下行为不同），且状态可相互转换
     *
     * 1、优点
     * rec: 将不同的状态隔离
     * rec: 把各种状态的转换逻辑，分部到State的子类中，减少相互依赖
     * rec: 增加新的状态非常简单
     *
     * 2、缺点
     * rec: 状态多的业务场景导致类数目增加，系统变复杂
     * */

    public static void main(String[] args) {
        CourseVideoContext courseVideoContext = new CourseVideoContext();
        courseVideoContext.setCourseVideoState(new PlayState());

        System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.pause();
        System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.speed();
        System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.stop();
        System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
    }
}
