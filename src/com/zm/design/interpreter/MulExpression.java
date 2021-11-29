package com.zm.design.interpreter;

import java.util.HashMap;

public class MulExpression extends SymbolExpression {

    public MulExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) * super.right.interpreter(var);
    }
}
