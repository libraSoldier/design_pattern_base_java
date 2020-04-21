package com.keeplearng.design.pattern.behavioral_xingweixing.chainofresponsibility_zerenlian;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author liangyu
 * @create 2020/4/21 10:18 下午
 * @Description
 */
public class ArticleApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getArticle())) {
            System.out.println(course.getName() + "还有手记，批准");
            if (approver != null) {
                approver.deploy(course);
            } else {
                System.out.println(course.getName() + "不包含手记，不批准，流程结束");
                return;
            }
        }
    }
}
