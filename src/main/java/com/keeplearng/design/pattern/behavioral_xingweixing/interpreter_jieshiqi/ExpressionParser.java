package com.keeplearng.design.pattern.behavioral_xingweixing.interpreter_jieshiqi;

import java.util.Stack;

/**
 * @Author liangyu
 * @create 2020/4/21 10:13 上午
 * @Description
 */
public class ExpressionParser {

    private Stack<Interpreter> stack = new Stack<Interpreter>();

    public int parser(String str){
        String[] srtItemArray = str.split(" ");
        for(String symbol : srtItemArray){
            if(!OperatorUtil.isOperator(symbol)){
                Interpreter numberInterpreter = new NumberInterpreter(symbol);
                stack.push(numberInterpreter);
                System.out.println(String.format("入栈：%d", numberInterpreter.interpreter()));
            } else {
                // 是运算符号可以运算
                Interpreter firstExpression = stack.pop();
                Interpreter secondExpression = stack.pop();
                System.out.println(String.format("出栈：%d 和 %d", firstExpression.interpreter(),
                        secondExpression.interpreter()));

                Interpreter operator = OperatorUtil.getExpressionObject(firstExpression, secondExpression, symbol);
                System.out.println(String.format("应用运算符：%s", operator));
                int result = operator.interpreter();

                NumberInterpreter resultExpression = new NumberInterpreter(result);
                stack.push(resultExpression);
                System.out.println(String.format("阶段结果入栈：%s", resultExpression.interpreter()));
            }
        }
        int result = stack.pop().interpreter();
        return result;
    }


}
