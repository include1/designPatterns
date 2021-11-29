package com.zm.design.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("解析器模式");
        //客户端输入应该使用逆波兰表达式
        System.out.println(10+20*10/2);
        System.out.println("请输入表达式");
        String expStr = getExpression();
        Calculator calculator = new Calculator(expStr);
        int result = calculator.run(getExpressionVal(expStr));
        System.out.println(expStr + "结果：" + result);
    }

    public static String getExpression() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        return bufferedReader.readLine();
    }

    public static HashMap<String, Integer> getExpressionVal(String expStr) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
        char[] chars = expStr.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '+' && chars[i] != '-' && chars[i] != '*' && chars[i] != '/') {
                int j = i;
                System.out.println("请输入" + chars[i] + "值是：");
                String expression = getExpression();
                if (j >= 2 && chars[--j] == '/'&& ("0").equals(expression)) {
                    System.out.println("该数不能为0，请重新输入");
                    expression = getExpression();
                }
                map.put(String.valueOf(chars[i]), Integer.valueOf(expression));
            }
        }
        return map;
    }
}
