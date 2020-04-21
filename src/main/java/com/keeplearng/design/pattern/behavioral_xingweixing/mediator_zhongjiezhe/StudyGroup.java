package com.keeplearng.design.pattern.behavioral_xingweixing.mediator_zhongjiezhe;

import java.util.Date;

/**
 * @Author liangyu
 * @create 2020/4/21 10:00 下午
 * @Description
 */
public class StudyGroup {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + "[" + user.getName()+ "]" + message);

    }
}
