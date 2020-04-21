package com.keeplearng.design.pattern.behavioral_xingweixing.interpreter_jieshiqi;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @Author liangyu
 * @create 2020/4/21 10:11 上午
 * @Description
 */
public class SpringTest {

    public static void main(String[] args) {
        org.springframework.expression.ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("100 * 2 + 400 * 1 + 66");
        Integer result = (Integer)expression.getValue();
        System.out.println(result);
    }

}
