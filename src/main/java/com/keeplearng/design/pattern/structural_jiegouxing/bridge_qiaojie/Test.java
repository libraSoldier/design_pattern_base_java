package com.keeplearng.design.pattern.structural_jiegouxing.bridge_qiaojie;

/**
 * Created by liangyu
 */
public class Test {
    public static void main(String[] args) {
        // rec：将账户和银行两个层级分开，将Account和Bank进行桥接，将Account和Bank进行解耦

        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        Bank icbcBank2 = new ICBCBank(new SavingAccount());
        Account icbcAccount2 = icbcBank2.openAccount();
        icbcAccount2.showAccountType();

        Bank abcBank = new ABCBank(new SavingAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();
    }
}
