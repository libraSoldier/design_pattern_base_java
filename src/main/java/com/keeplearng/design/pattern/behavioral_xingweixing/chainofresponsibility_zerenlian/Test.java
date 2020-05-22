package com.keeplearng.design.pattern.behavioral_xingweixing.chainofresponsibility_zerenlian;

/**
 * @Author liangyu
 * @create 2020/4/21 10:22 下午
 * @Description
 */
public class Test {

    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("名称");
        course.setArticle("手记");
        course.setVideo("视频");

        articleApprover.setNextApprover(videoApprover);

        articleApprover.deploy(course);
    }


    /**
     * 责任链模式总结：
     *
     * 定义：
     * 为请求创建一个接受此次请求对象的链
     *
     * 适用场景：
     * 一个请求的处理需要多个对象当中的一个或几个协作处理
     *
     * 1、优点
     * rec: 请求的发送者和接受者（请求的处理）解耦
     * rec: 责任链可以动态组合
     *
     * 2、缺点
     * rec: 责任链太长或者处理时间过长，影响性能
     * rec: 责任链可能过多
     * */




}
