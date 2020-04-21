package com.keeplearng.design.pattern.behavioral_xingweixing.mediator_zhongjiezhe;

/**
 * @Author liangyu
 * @create 2020/4/21 10:00 下午
 * @Description
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message){
        StudyGroup.showMessage(this, message);
    }
}
