package com.zm.design.interpreter;

import java.util.HashMap;
//操作符解释器，每个操作符的左右两边都有一个值
public class SymbolExpression extends Expression {
    Expression left;
    Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
