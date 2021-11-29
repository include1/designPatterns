package com.zm.design.interpreter;

import java.util.HashMap;

public class DivExpression extends SymbolExpression {
    public DivExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) / super.right.interpreter(var);
    }
}
