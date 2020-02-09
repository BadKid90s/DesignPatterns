package com.wry.patterns.interpreter.type2;

import com.wry.patterns.interpreter.type1.AndNode;
import com.wry.patterns.interpreter.type1.SentenceNode;

import java.util.Stack;

/**
 * 指令处理类：工具类
 */
public class InstructionHandler {
    private String instruction;
    private AbstractExpression expression;

    public InstructionHandler(String instruction) {
        this.instruction = instruction;
    }

    public void handle(Context context) {
        AbstractExpression left = null, right = null;
        Stack stack = new Stack(); //声明一个栈对象用于存储抽象语法树
        char[] array = instruction.toCharArray();//分隔指令字符串
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '+') {
                left = (AbstractExpression) stack.pop(); //弹出栈顶表达式作为左表达式
                char word1 = array[++i];
                Integer rightNumber = context.lookup(String.valueOf(word1));
                right = new TerminalExpression(rightNumber); //右表达式
                stack.push(new AddNonTerminalExpression(left, right)); //将新表达式压入栈中
            } else if (array[i] == '-') {
                left = (AbstractExpression) stack.pop(); //弹出栈顶表达式作为左表达式
                char word1 = array[++i];
                Integer rightNumber = context.lookup(String.valueOf(word1));
                right = new TerminalExpression(rightNumber); //右表达式
                stack.push(new SubNonTerminalExpression(left, right)); //将新表达式压入栈中
            } else {
                Integer number = context.lookup(String.valueOf(array[i]));
                stack.push(new TerminalExpression(number)); //将新表达式压入栈中
            }
        }
        this.expression = (AbstractExpression) stack.pop(); //将全部表达式从栈中弹出
    }

    public void output() {
        //解释表达式
        Integer result = expression.interpreter();
        System.out.println(this.instruction+" 的最终结果是："+result);
    }

}

