package com.keeplearng.design.pattern.behavioral_xingweixing.interpreter_jieshiqi;

/**
 * @Author liangyu
 * @create 2020/4/21 10:10 上午
 * @Description
 */
public class Test {

    public static void main(String[] args) {

        String inputString = "6 100 11 + *";
        ExpressionParser expressionParser = new ExpressionParser();
        int result = expressionParser.parser(inputString);
        System.out.println("解释器计算结果： " + result);
    }

    /**
     * 解释器模式总结：
     *
     * 定义：
     * 给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子
     * 为了解释一种语言，而为语言创建的解释器
     *
     * 适用场景：
     * 某个特定类型问题发生频率足够高
     *
     * 1、优点
     *
     * 2、缺点
     * rec: 当语法规则数目太多时，增加了系统复杂度
     * */

}
