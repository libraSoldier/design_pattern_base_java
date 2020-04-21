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


}
