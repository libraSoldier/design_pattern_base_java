package com.keeplearng.design.pattern.behavioral_xingweixing.chainofresponsibility_zerenlian;

/**
 * @Author liangyu
 * @create 2020/4/21 10:16 下午
 * @Description
 */
public abstract class Approver {

    protected Approver approver;

    public void setNextApprover(Approver approver){
        this.approver = approver;
    }

    public abstract void deploy(Course course);


}
