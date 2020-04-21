package com.keeplearng.design.pattern.behavioral_xingweixing.interpreter_jieshiqi;

/**
 * @Author liangyu
 * @create 2020/4/21 10:14 上午
 * @Description
 */
public class MultiInterpreter implements Interpreter {

    private Interpreter firstExpression, secondExpression;

    public MultiInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpreter() {
        return this.firstExpression.interpreter() * this.secondExpression.interpreter();
    }

    @Override
    public String toString() {
        return "*";
    }
}
