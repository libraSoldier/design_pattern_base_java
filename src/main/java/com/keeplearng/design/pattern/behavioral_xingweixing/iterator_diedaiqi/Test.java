package com.keeplearng.design.pattern.behavioral_xingweixing.iterator_diedaiqi;

/**
 * Created by liangyu.
 */
public class Test {

    /**
     * 迭代器模式总结：
     *
     * 定义：
     * 提供一种方法，顺序访问一个集合对象中的各个元素，从而又不暴露该对象的内部表示
     *
     * 适用场景：
     * 访问一个集合对象的内容而不需暴露它的内部表示
     * 为遍历不同的集合结构提供一个统一的接口
     *
     * 1、优点
     * rec: 分离了集合对象的遍历行为
     *
     * 2、缺点
     * rec: 类的个数成对增加
     * */


    public static void main(String[] args) {
        Course course1 = new Course("Java电商一期");
        Course course2 = new Course("Java电商二期");
        Course course3 = new Course("Java设计模式精讲");
        Course course4 = new Course("Python课程");
        Course course5 = new Course("算法课程");
        Course course6 = new Course("前端课程");


        CourseAggregate courseAggregate = new CourseAggregateImpl();

        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);
        courseAggregate.addCourse(course3);
        courseAggregate.addCourse(course4);
        courseAggregate.addCourse(course5);
        courseAggregate.addCourse(course6);

        System.out.println("-----课程列表-----");
        printCourses(courseAggregate);

        courseAggregate.removeCourse(course4);
        courseAggregate.removeCourse(course5);

        System.out.println("-----删除操作之后的课程列表-----");
        printCourses(courseAggregate);
    }


    public static void printCourses(CourseAggregate courseAggregate){
        CourseIterator courseIterator= courseAggregate.getCourseIterator();
        while(!courseIterator.isLastCourse()){
            Course course=courseIterator.nextCourse();
            System.out.println(course.getName());
        }
    }


}
