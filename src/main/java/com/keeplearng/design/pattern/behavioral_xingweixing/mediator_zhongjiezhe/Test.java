package com.keeplearng.design.pattern.behavioral_xingweixing.mediator_zhongjiezhe;

/**
 * @Author liangyu
 * @create 2020/4/21 10:00 下午
 * @Description
 */
public class Test {

    public static void main(String[] args) {
        User user1 = new User("A");
        User user2 = new User("B");

        user1.sendMessage("B你好，我是A");
        user2.sendMessage("收到，我是B");
    }

}
