package com.keeplearng.design.pattern.structural_jiegouxing.bridge_qiaojie;

/**
 * Created by liangyu
 */
public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();
        return account;
    }
}
