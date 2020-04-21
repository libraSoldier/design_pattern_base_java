package com.keeplearng.design.pattern.structural_jiegouxing.bridge_qiaojie;

/**
 * Created by liangyu
 */
public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        // rec: 方法委托到此处
        account.openAccount();
        return account;
    }
}
