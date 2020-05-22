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

    /**
     * 桥接模式总结：
     *
     * 定义：
     * 将抽象部分与它的具体实现部分分离，使它们都可以独立地变化
     * 通过组合的方式建立两个类之间联系，而不是继承
     *
     * 适用场景：
     * 抽象和具体实现之间增加更多的灵活性
     * 一个类存在两个（或多个）独立变化的维度，且这两个（或多个）维度都需要独立进行扩展
     * 不希望使用继承，或因为多层继承导致系统类的个数剧增
     *
     * 1、优点
     * rec: 分离抽象部分及其具体实现部分
     * rec: 提高了系统的可扩展性
     * rec: 符合开闭原则
     * rec: 符合合成复用原则
     *
     * 2、缺点
     * rec: 增加了系统的理解与设计难度
     * rec: 需要正确地识别出系统中两个独立变化的维度
     * */
}
