package com.keeplearng.design.pattern.structural_jiegouxing.bridge_qiaojie;

/**
 * Created by liangyu
 */
public abstract class Bank {
    protected Account account;
    public Bank(Account account){
        this.account = account;
    }
    abstract Account openAccount();

}
