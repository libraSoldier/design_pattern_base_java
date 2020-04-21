package com.keeplearng.design.pattern.behavioral_xingweixing.chainofresponsibility_zerenlian;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author liangyu
 * @create 2020/4/21 10:18 下午
 * @Description
 */
public class VideoApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getVideo())) {
            System.out.println(course.getName() + "还有视频，批准");
            // rec: 这里必须要空判断
            if (approver != null) {
                approver.deploy(course);
            } else {
                System.out.println(course.getName() + "不包含视频，不批准，流程结束");
                return;
            }
        }
    }
}
