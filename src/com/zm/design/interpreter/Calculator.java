package com.zm.design.interpreter;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {
    private Expression expression; //记录解析后的表达式

    public Calculator(String expStr) {
        //表达式解析结果
        this.expression = getExpressionResult(expStr);
    }

    public Expression getExpressionResult(String expStr) {
        //解析表达式
        Stack<Expression> stack = new Stack<>();
        char[] chars = expStr.toCharArray();
        Expression left = null;
        Expression right = null;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                case '*':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new MulExpression(left, right));
                    break;
                case '/':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new DivExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(chars[i])));
            }
        }
        return stack.pop();
    }

    //给解析后的表达式赋值
    public int run(HashMap<String, Integer> var) {
        return expression.interpreter(var);
    }
}
