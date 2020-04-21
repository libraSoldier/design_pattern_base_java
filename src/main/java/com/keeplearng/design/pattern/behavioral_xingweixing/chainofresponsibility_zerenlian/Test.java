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





}
