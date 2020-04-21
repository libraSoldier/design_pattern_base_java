package com.keeplearng.design.pattern.behavioral_xingweixing.interpreter_jieshiqi;

/**
 * @Author liangyu
 * @create 2020/4/21 10:12 上午
 * @Description
 */
public class OperatorUtil {

    public static boolean isOperator(String symbol){
        return symbol.equals("+") || symbol.equals("*");
    }

    public static Interpreter getExpressionObject(Interpreter firstExpression, Interpreter secondExpression,
                                                  String symbol){
        if(symbol.equals("+")){
            return new AddInterpreter(firstExpression, secondExpression);
        } else if(symbol.equals("*")){
            return new MultiInterpreter(firstExpression, secondExpression);
        }
        // rec: 可以返回空对象
        return null;
    }
}
